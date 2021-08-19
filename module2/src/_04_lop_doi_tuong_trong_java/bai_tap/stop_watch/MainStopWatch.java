package _04_lop_doi_tuong_trong_java.bai_tap.stop_watch;

public class MainStopWatch {
    public static void main(String[] args) {
        int[] mang=new int[100000];
        for(int i=0;i<mang.length;i++){
            mang[i]=(int)Math.random()*1000;
        }
        XayDungLopStopWatch xayDungLopStopWatch=new XayDungLopStopWatch();
        xayDungLopStopWatch.setStartTime();
        SapXep sapxep=new SapXep();
        mang=sapxep.sort(mang);
        xayDungLopStopWatch.setEndTime();
        System.out.println(xayDungLopStopWatch.getElapsedTime());

    }

}
