package Prototype;

import java.io.Serializable;

public class Client implements Serializable {
    public static void main(String args[]){
        WeeklyLog weeklyLog,copyWeeklyLog=null;

        weeklyLog=new WeeklyLog();
        weeklyLog.content="第12周 - 完成模块A设计";
        try{
            copyWeeklyLog=(WeeklyLog)weeklyLog.deepClone();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.print("周报是否相同？");
        System.out.println(weeklyLog==copyWeeklyLog);

        System.out.print("附件是否相同？");
        System.out.println(weeklyLog.getAttachment()==copyWeeklyLog.getAttachment());

        System.out.print("原始周报内容：");
        System.out.println(weeklyLog.content);

        System.out.print("克隆周报内容：");
        System.out.println(copyWeeklyLog.content);

    }
}
