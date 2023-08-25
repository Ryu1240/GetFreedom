//Dayクラス【第４版】
import java.util.Calendar;

public class Day {
    private int year    =1;
    private int month   =1;
    private int date    =1;
    static Calendar cl;
    //クラス初期化子
    static{
        //Calendarクラスのオブジェクトを生成する
        cl = Calendar.getInstance();
    }
    //①y年は閏年か？
    public static boolean isLeap(int y){
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    public Day()                                {
        year = cl.get(Calendar.YEAR);
        month= cl.get(Calendar.MONTH);
        date = cl.get(Calendar.DATE);
    }
    public Day(int year)                        {this.year =year;}

    public Day(int year,int month){
        this(year);
        if(month < 1) month = 1;
        if(month >12) month = 12;
        this.month = month;
    }
    public Day(int year,int month,int day){
        this(year,month);
        Calendar tmpCl = Calendar.getInstance();
        tmpCl.set(year,month-1,1);
        int lastday = tmpCl.getActualMaximum(Calendar.DAY_OF_MONTH);
        if(day > lastday)
            date = lastday;
        else
            date = day;
    }
    public Day(Day d)                           {this(d.year,d.month,d.date);}

    public int getYear() {return year;}
    public int getMonth() {return month;}
    public int getDate() {return date;}

    public void setYear(int year)   {this.year  = year;}
    public void setMonth(int month) {this.month = month;}
    public void setDate(int date)   {this.date  = date;}

    public void set(int year,int month,int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    //②閏年か？
    public boolean isLeap(){
        return isLeap(year);
    }

    public int dayOfWeek(){
        int y = year;
        int m = month;
        if(m == 1 || m == 2){
            y--;
            m += 12;
        }
        return (y + y / 4 - y /100 + y /400 + (13 *m + 8) / 5 + date) % 7;
    }

    public boolean equalTo(Day d){
        return year == d.year && month == d.month && date == d.date;
    }

    public int elapsedDays(){
        int result = 0;
        Calendar tmpCl = Calendar.getInstance();
        tmpCl.set(year,0,1);
        //直前の月までの合計に日数を足し合わせる。
        for(int i = 0; i < month-1; i++){
            tmpCl.set(year,i,1);
            result += tmpCl.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
        result += date;
        return result;
    }

    public int remainDays(){
        int result = 0;
        Calendar tmpCl = Calendar.getInstance();
        tmpCl.set(year,month-1,1);
        result = tmpCl.getActualMaximum(Calendar.DAY_OF_MONTH) - date;
        //次の月から年末までの合計日数を求める。
        for(int i = month; i < 12; i++){
            tmpCl.set(year,i,1);
            result += tmpCl.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
        return result;
    }



    public String toString(){
        String[] wd ={"日","月","火","水","木","金","土"};
        return String.format("%04d年%02d月%02d日(%s)",year,month,date,wd[dayOfWeek()]);
    }
    
}
