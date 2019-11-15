package com.dhm.download;
//  https://blog.csdn.net/u014386474/article/details/52190158
public class TestMethod {
    public TestMethod() {
        try {
//            DownFileInfoBean bean = new DownFileInfoBean(
//                    "http://cdn.market.hiapk.com/data/upload//2012/09_27/17/car.wu.wei.kyo.shandian_174928.apk", "D:\\temp",
//                    "shandian_174928.apk", 5,true,null);
            DownFileInfoBean bean = new DownFileInfoBean(
                    "http://pdfzj.cn/2015/kjxs_0506/108.html#download_area__", "/Users/dhm/002/004/",
                    "ssssss.pdf", 5,true,null);
            /*File file = new File("D:\\dan07.apk");
            DownFileInfoBean bean = new DownFileInfoBean(null, "D:\\temp",
                    "dan07.apk", 3,false,file);*/
            DownFileFetch fileFetch = new DownFileFetch(bean);
            fileFetch.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TestMethod();
    }
}