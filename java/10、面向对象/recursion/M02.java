//递归 应用，找迷宫
public class M02 {
    public static void main(String[] args) {
		int map[][] = new int[8][7];
		for (int i = 0; i<7 ;i++ ) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i<8 ;i++ ) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        System.out.println("找路前.......");
        for (int i = 0; i<map.length ;i++ ) {
            for (int j = 0; j<map[i].length ;j++ ) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("找路后.......");
        Test t  = new Test();
        t.findWay(map,1,1);
        for (int i = 0; i<map.length ;i++ ) {
            for (int j = 0; j<map[i].length ;j++ ) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Test{
    ////从1,1出发，只要还没到6,5，都在探索阶段
    //0:标识可以走，1：标识障碍物，2：表示可以走，3：标识走过，但是走不通
    public boolean findWay(int map[][],int i,int j){
        // map[6][5]说明找到路径找到了
        if(map[6][5] == 2){
            return true;
        }else{
            if(map[i][j] == 0){
                map[i][j] = 2;//假设i，j可以走，那么探测他下右上左是否能走通
                if(findWay(map, i+1, j)){//走下面一个点
                    return true;
                }else if(findWay(map, i, j+1)){//走右面一个点
                    return true;
                }else if(findWay(map, i-1, j)){//走上面一个点
                    return true;
                }else if(findWay(map, i, j-1)){//走左面一个点
                    return true;
                }else{
                    map[i][j] = 3;
                    return false;
                }

            }else{
                return false;
            }
        }
    }
}
