package com.study.structure;

/**
 * 稀疏数组
 */
public class SpareArray {
    public static void main(String[] args) {
        //创建一个11*11的而二位数组
        int chressArr[][] = new int[11][11];
        chressArr[1][2] = 1;
        chressArr[2][3] = 2;
        //二维数组打印
        for (int[] arr : chressArr) {
            for (int data : arr) {
                System.out.printf("%d\t", data);

            }
            System.out.println();
        }

        //将二维数组转换成稀疏数组
        int sum = 0;  //看下有没有个非零数据
        for (int i = 0; i < chressArr.length; i++) {
            for (int j = 0; j < chressArr[i].length; j++) {
                if (chressArr[i][j] != 0) {
                    sum++;
                }
            }
        }

        System.out.println("sum=" + sum);

        int spareArr[][] = new int[sum + 1][3];
        spareArr[0][0] = chressArr.length;
        spareArr[0][1] = chressArr[0].length;  //第一行有几列
        spareArr[0][2] = sum;


        int count = 0;
        for (int i = 0; i < chressArr.length; i++) {
            for (int j = 0; j < chressArr[i].length; j++) {
                if (chressArr[i][j] != 0) {
                    count++;
                    spareArr[count][0] = i;
                    spareArr[count][1] = j;
                    spareArr[count][2] = chressArr[i][j];
                }
            }
        }
        System.out.println();

        //遍历稀疏数组
        for (int i = 0; i < spareArr.length; i++) {
            System.out.printf("%d\t%d\t%d\n", spareArr[i][0], spareArr[i][1], spareArr[i][2]);
        }

        System.out.println();

        /**
         * 稀疏数组转二维数组
         */

        int chressArr2[][] = new int[spareArr[0][0]][spareArr[0][1]];
        for (int i = 1; i < spareArr.length; i++) {
            chressArr2[spareArr[i][0]][spareArr[i][1]] = spareArr[i][2];
        }

        for (int[] arr : chressArr2) {
            for (int data : arr) {
                System.out.printf("%d\t", data);

            }
            System.out.println();
        }


    }
}
