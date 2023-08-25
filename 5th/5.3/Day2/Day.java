public class Day {
    private int year;
    private int month;
    private int date;

    public Day()                                {set(1,1,1);}
    public Day(int year)                        {set(year,1,1);}
    public Day(int year,int month)              {set(year,month,1);}
    public Day(int year,int month,int date)     {set(year,month,date);}
    public Day(Day d)                           {set(d.year,d.month,d.date);}

    public int getYear() {return year;}
    public int getMonth() {return month;}
    public int getDate() {return date;}

    public void set(int year, int month, int date){
        this.year   = year; //年
        this.month  = month;//月
        this.date   = date; //日
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

    public String toString(){
        String[] wd ={"日","月","火","水","木","金","土"};
        return String.format("%04d年%02d月%02d日(%s)",year,month,date,wd[dayOfWeek()]);
    }
    
}
