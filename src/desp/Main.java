package desp;

import java.util.*;

/**
 * created by KinMan谨漫 on 2024/8/12 19:44
 *
 * @author KinMan谨漫
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] a=new int[]{2,3};
       
    }
    public int twoSum(int[] nums, int target){
        int[] chaBiao =new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            chaBiao[i]=nums[i+1]-nums[i];
        }
        int left=0;
        int right=nums.length-1;
        int sum=nums[left]+nums[right];
       while (sum<target){
            left++;
           sum=nums[left]+nums[right];
        }
       while (sum<target){
            left++;
           sum=nums[left]+nums[right];
        }max=Integer.MIN_VALUE

        ArrayList<Node> nodeList= new ArrayList<>();
//       nodeList.stream().map(node -> node.value).max(new Comparator<Long>() {
//           @Override
//           public int compare(Long o1, Long o2) {
//               return (int) (o1-o2);
//           }
//       })
        Optional<Node> node=nodeList.stream().max((o1, o2) -> (int) (o1.value-o2.value));
        long s=node.get().value;
        nodeList.sort((o1, o2) -> (int) (o1.value-o2.value));
    }



}import java.util.Scanner;

        import java.util.*;

class Node{
    ArrayList<Node> childList= new ArrayList<>();
    Node pre;
    long value;
    public Node(long value1){
        value=value1;
    }



}import java.util.Scanner;

// 注意类名必须为 desp.Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        // while (in.hasNextInt()) { // 注意 while 处理多个 case
        //     int a = in.nextInt();
        //     int b = in.nextInt();
        //     System.out.println(a + b);
        // }
        int n=in.nextInt();
        int m= n*2-1;
        long[] array=new long[m];
        long preSum=0;
        int count=0;
        for(int i=0;i<m;i++){
            array[i]=in.nextLong();
            if(array[i]<0){
                array[i]=-array[i];
                count++;

            }
            // System.out.println( array[i]);
            preSum+=array[i];
        }
        //判断有多少个负数没有办法转正
        count=count%n + n;
        System.out.println(preSum);


    }
}