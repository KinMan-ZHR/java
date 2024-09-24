package test;

/**
 * created by KinMan谨漫 on 2024/9/22 11:18
 *
 * @author KinMan谨漫
 */
public class kk {

    public static void main(String[] args) {
        String s="kk";
        String s1="kk";
        String s2=new String("kk");
        String s3=new String("kk");
        String s4=new String("kk").intern();
        System.out.println(s1==s2);//false
        System.out.println(s1==s);//true
        System.out.println(s2==s3);//false
        System.out.println(s1==s4);//true
        int a=1;
        int b=1;
        System.out.println(a==b);//true
        Integer c=1;
        Integer d=1;
        System.out.println(c==d);//true
        Integer e=128;
        Integer f=128;
        System.out.println(e==f);//false
        Integer g=128;
        int h=128;
        System.out.println(g==h);//true

    }


}
