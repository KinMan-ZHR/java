package Test2024_09_08;

/**
 * created by KinMan谨漫 on 2024/9/8 13:55
 *
 * @author KinMan谨漫
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BinaryOperator;

// 注意类名必须为 desp.Main, 不要有任何 package xxx 信息
enum Dir{
    L,R,U,D;

}
public class RedCampus {
    static SelfNode maxNode;
    static long sum=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别

        int n = in.nextInt();
        int m = in.nextInt();
        StringBuilder array= new StringBuilder(n);
        for (int i=0; i< n;i++){
             array.append(in.next());
        }
        System.out.println(array);
        int tempi;
        int tempj;
        HashMap<Integer,Integer> hashOKMap = new HashMap<>();
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                tempi=i;
                tempj=j;
                HashMap<Integer,Integer> hashMap = new HashMap<>();
                while (true){
                    int index=tempi*m+tempj;


                    if(array.charAt(index)=='L'){
                        tempj--;
                    } else if(array.charAt(index)=='R'){
                         tempj++;
                    } else if(array.charAt(index)=='U'){
                         tempi--;
                    } else if(array.charAt(index)=='D'){
                         tempi++;
                    }

                    if(hashMap.containsKey(index)){
                        sum++;
                        hashMap.replace(index,1);
                        hashMap.replaceAll();
                       // hashOKMap.put(index,0);
                        break;
                    }
                    hashMap.put(index,0);
                    if(tempi<0||tempj<0||tempi>=n||tempj>=m)
                        break;
                }

            }


        }

//        ArrayList<SelfNode> nodeList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            nodeList.add(new SelfNode(in.nextLong()));
//        }
//        //关系构建
//        for (int i = 0; i < n - 1; i++) {
//            nodeList.get(in.nextInt() - 1).childList.add(nodeList.get(in.nextInt() - 1));
//        }
//        //计算孩子最大值
//        SelfNode parent = nodeList.get(0);

        // while (parent != null) {
        //     // parent.childList.sort(new Comparator<SelfNode>() {
        //     //     @Override
        //     //     public int compare(SelfNode o1, SelfNode o2) {
        //     //         return (int) (o1.value - o2.value);
        //     //     }
        //     // });
        //     // nodeList.stream().max(
        //     // new Comparator<SelfNode>() {
        //     //         @Override
        //     //         public int compare(SelfNode o1, SelfNode o2) {
        //     //             return (int) (o1.value - o2.value);
        //     //         }
        //     //     });
        //      Optional<SelfNode> node=nodeList.stream().max((o1, o2) -> (int) (o1.value-o2.value));


        //     }
        //solution(parent);
        System.out.println(sum);

    }
    public static void solution(SelfNode node){
        if(node==null||node.childList.isEmpty())
            return;
        ArrayList<SelfNode> nodeList =node.childList;
        for(int i=0;i<nodeList.size(); i++){
            System.out.println(nodeList.get(i).value);
            solution(nodeList.get(i));
        }
        maxNode=nodeList.stream().max((o1, o2) -> (int) (o1.value-o2.value)).get();
        System.out.println(maxNode.value);
        if (maxNode.value > node.value) {
            sum += maxNode.value - node.value;
            node.value = maxNode.value;
        }

    }
}

//class SelfNode {
//    ArrayList<SelfNode> childList = new ArrayList<>();
//    SelfNode pre;
//    long value;
//    public SelfNode(long value1) {
//        value = value1;
//    }
//}