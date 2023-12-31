class Day {
    private int year;
    private int month;
    private int date;

    //コンストラクタ
    Day(int year,int month,int date){
        this.year = year;   //年
        this.month = month; //月
        this.date = date;   //日
    }

    //ゲッタ
    int getYear(){return year;}     //年を取得
    int getMonth(){return month;}   //月を取得
    int getDate(){return date;}     //日を取得

    //セッタ
    void setYear(int year){this.year = year;}       //年を設定
    void setMonth(int month){this.month = month;}   //月を設定
    void setDate(int date){this.date = date;}       //日を設定

    void set(int year, int month, int date){    //年月日
        this.year = year;       //年
        this.month = month;     //月
        this.date = date;       //日
    }

    // 曜日を求める
    int dayOfWeek(){
        int y = year;
        int m = month;
        if( m == 1 || m == 2){
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }
}
