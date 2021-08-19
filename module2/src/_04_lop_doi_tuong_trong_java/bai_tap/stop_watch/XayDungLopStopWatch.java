package _04_lop_doi_tuong_trong_java.bai_tap.stop_watch;

public class XayDungLopStopWatch {
    public long startTime, endTime;

    public XayDungLopStopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        long start = getStartTime();
        long end = getEndTime();
        return end - start;
    }

}

class SapXep {
     int[] sort(int... mang1) {
        int indexMin, i, j;
        for (i = 0; i < mang1.length - 1; i++) {
            indexMin = i;

            for (j = i + 1; j < mang1.length; j++) {
                if (mang1[j] < mang1[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = mang1[indexMin];
                mang1[indexMin] = mang1[i];
                mang1[i] = temp;
            }
        }
        return mang1;
    }



}
