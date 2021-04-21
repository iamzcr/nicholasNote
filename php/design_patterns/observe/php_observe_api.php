<?php

/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2019/3/6
 * Time: 22:44
 * php提供了观察者observe和被观察者Subject的接口
 */
class User implements SplSubject
{
    public $observers = null;
    public $login_num;
    public $hobby;

    public function __construct($hobby)
    {
        $this->observers = new SplObjectStorage();
        $this->login_num = rand(1, 10);
        $this->hobby = $hobby;
    }

    /**
     * @param SplObserver $observer
     * @return bool
     * 添加一个观察者
     */
    public function attach(SplObserver $observer)
    {
        $this->observers->attach($observer);
    }

    /**
     * @param SplObserver $observer
     * @return bool
     * 删除一个观察者
     */
    public function detach(SplObserver $observer)
    {
        $this->observers->detach($observer);
    }

    /**
     * @return bool
     * 通知所有观察者
     */
    public function notify()
    {
        //通知第一种方式
        /*
        foreach ($this->observers as $observer) {
            $observer->update($this);
        }
        */
        //通知第二种方式
        $this->observers->rewind();
        while ($this->observers->valid()) {
            $observe = $this->observers->current();
            $observe->update($this);
            $this->observers->next();
        }
    }

    public function login()
    {
        $this->notify();
    }
}

class Safe implements SplObserver
{
    public function update(SplSubject $subject)
    {
        if ($subject->login_num < 3) {
            echo '第' . $subject->login_num . '登录';
        } else {
            echo '第' . $subject->login_num . '登录,异常';
        }
    }
}

class Ad implements SplObserver
{
    public function update(SplSubject $subject)
    {
        if ($subject->hobby == 'sport') {
            echo '体育';
        } else {
            echo '其他';
        }
    }
}

$user = new User('sport');
$user->attach(new Ad());
$user->attach(new Safe());
$user->login();