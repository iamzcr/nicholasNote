//�ݹ� Ӧ�ã����Թ�
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
        System.out.println("��·ǰ.......");
        for (int i = 0; i<map.length ;i++ ) {
            for (int j = 0; j<map[i].length ;j++ ) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("��·��.......");
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
    ////��1,1������ֻҪ��û��6,5������̽���׶�
    //0:��ʶ�����ߣ�1����ʶ�ϰ��2����ʾ�����ߣ�3����ʶ�߹��������߲�ͨ
    public boolean findWay(int map[][],int i,int j){
        // map[6][5]˵���ҵ�·���ҵ���
        if(map[6][5] == 2){
            return true;
        }else{
            if(map[i][j] == 0){
                map[i][j] = 2;//����i��j�����ߣ���ô̽�������������Ƿ�����ͨ
                if(findWay(map, i+1, j)){//������һ����
                    return true;
                }else if(findWay(map, i, j+1)){//������һ����
                    return true;
                }else if(findWay(map, i-1, j)){//������һ����
                    return true;
                }else if(findWay(map, i, j-1)){//������һ����
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
