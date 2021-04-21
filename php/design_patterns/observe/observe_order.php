<?php

//被观察者
class Order implements SplSubject
{
    public $observers = null;

    public function __construct()
    {
        $this->observers = new SplObjectStorage();
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
        $this->observers->rewind();
        while ($this->observers->valid()) {
            $observe = $this->observers->current();
            $observe->update($this);
            $this->observers->next();
        }
    }

    public function addOrder()
    {
        //订单入库成功，返回计数1，失败返回0
        $flag = 1;
        if ($flag) {
            $this->notify();
        } else {
            return false;
        }
    }

}

//观察者
class SyncOrder implements SplObserver
{
    public function update(SplSubject $subject)
    {
        echo "通知服务端";
    }
}

$order = new Order();
$order->attach(new SyncOrder());
$order->addOrder();