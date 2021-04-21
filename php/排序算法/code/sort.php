<?php
$test_arr = array(1,6,32,5,19,56,4,2,5,66,465,48,65,45,33);
//冒泡排序
function bubble_sort($array){
    $count = count($array);
    if ($count <= 0) return false;
    for($i=0; $i<$count; $i++){
        for($j=$i; $j<$count; $j++){
            if ($array[$i] < $array[$j]){
                $tmp = $array[$i];
                $array[$i] = $array[$j];
                $array[$j] = $tmp;
            }
        }
    }
    return $array;
}

function quick_sort($array) {
    if (count($array) <= 1) return $array;
    $key = $array[0];
    $left_arr = array();
    $right_arr = array();
    for ($i=1; $i<count($array); $i++){
        if ($array[$i] <= $key)
            $left_arr[] = $array[$i];
        else
            $right_arr[] = $array[$i];
    }
    $left_arr = quick_sort($left_arr);
    $right_arr = quick_sort($right_arr);
    return array_merge($left_arr, array($key), $right_arr);
}
/**
*$low 起始位置
*$high 终点位置
*$k 查找元素
*/
function bin_sch($array, $low, $high, $k){
    if ($low <= $high){
        $mid = intval(($low+$high)/2);
        if ($array[$mid] == $k){
                return $mid;
        }elseif ($k < $array[$mid]){
            return bin_sch($array, $low, $mid-1, $k);
        }else{
            return bin_sch($array, $mid+1, $high, $k);
        }
    }
    return -1;
}

function seq_sch($array, $n, $k){
    $array[$n] = $k;
    for($i=0; $i<$n; $i++){
        if($array[$i]==$k){
            break;
        }
    }
    if ($i<$n){
        return $i;
    }else{
        return -1;
    }
}
// var_export(bubble_sort($test_arr));
// var_export(quick_sort($test_arr));

$low = 0;
$hight = count($test_arr) - 1;
$findVal = 5;
$index = bin_sch($test_arr, $low, $hight, $findVal);
printf("查找的值 '%d' 在数组中的下标 '%s'", $findVal, $index);



$n = count($test_arr);
$ind = seq_sch($test_arr,$n,48);
printf("查找的值 48 在数组中的下标 '%s'", $ind);

?>