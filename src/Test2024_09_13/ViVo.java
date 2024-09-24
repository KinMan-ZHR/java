package Test2024_09_13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * created by KinMan谨漫 on 2024/9/13 15:24
 *
 * @author KinMan谨漫
 */
public class ViVo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices= new int[n];
        for (int i=0;i<n;i++){
            prices[i]=in.nextInt();

        }
        System.out.println(canEqualDistribution(prices,k));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param prices int整型一维数组 礼物的价格
     * @param k int整型 粉丝人数
     * @return bool布尔型
     */

        public static boolean canEqualDistribution (int[] prices, int k) {
            // write code here
            int sum=Arrays.stream(prices).sum();
           //Arrays.stream(prices).filter();
            if(sum%k != 0){
                return false;
            }
            int average = sum/k;
            Arrays.sort(prices);
            if(prices[prices.length-1]>average)
                return false;

            int last=prices.length-1;
            int first=0;
            while(prices[last]==average){
                last--;
                if(last==0)
                    return true;
            }
            while(last>first){
                int dis=prices[last]+prices[first]-average;
                if(dis>0)//这样子只能解决两个合体的情况
                    return false;
                if(dis<0){
                    if(prices[last])
                }
                last--;
                first++;
            }
            return true;
        }
        public static boolean kSum(int[] prices,Boolean[] check,int k){

        }


}
