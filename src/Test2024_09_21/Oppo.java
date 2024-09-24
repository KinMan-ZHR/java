package Test2024_09_21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * created by KinMan谨漫 on 2024/9/21 19:33
 *
 * @author KinMan谨漫
 */
public class Oppo {


    // 注意类名必须为 Main, 不要有任何 package xxx 信息

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
//            while (in.hasNextInt()) { // 注意 while 处理多个 case
//                int a = in.nextInt();
//                int b = in.nextInt();
//                System.out.println(a + b);
//            }
            int n = in.nextInt();
           // int t = in.nextInt();
            int[] array = new int[n];
            for (int i=0;i<n;i++){
                array[i]=in.nextInt();
            }
            int[] a =solution2(array);

            for (int i=0;i<a.length;i++){
                System.out.print(a[i]);
                if (i<a.length-1){
                    System.out.print(" ");
                }
            }



        }
        public static int solution(int[] array,int t){
            Arrays.sort(array);
            int l=0;
            int sum=Arrays.stream(array).sum();
            for(int i=0;i<array.length;i++){
                int temp=sum-array[i]-array[i];
                if(temp>=0&&temp<=t){
                    l++;
                }
                if(temp<0&&array[i]>0){
                    break;
                }
                if(temp>t&&array[i]<0){
                    break;
                }

            }
            return l;



        }
        public static int[] solution2(int[] array){
            Arrays.sort(array);
            int l=0;
            //如果自己是不可重复的，那么就保持，否则向上溯回;
            HashMap<Integer,Integer> hashMap=new HashMap<>();
            //int[] place =new int[array.length];
            boolean dup=false;
            for(int i=0;i<array.length;i++) {
                if(array[i]==l){
                    l++;
                    if(dup);

                }

                else if(array[i]<l){//重复了
                    hashMap.put(array[i],l);
                    dup=true;
                }else{
                    l=array[i]+1;
                    hashMap.put(array[i-1],l);
                }
            }
            for(int i=0;i<array.length;i++){
                if (hashMap.containsKey(array[i]))
                  array[i]=hashMap.get(array[i]);


            }

            return array;
        }
//        public int solution3(){
//
//        }

    }

