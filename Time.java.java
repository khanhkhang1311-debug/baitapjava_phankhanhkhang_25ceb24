public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time() {
        this(0,0,0);
    }
    public int getHour() {
        this.hour = hour;
        return hour;
    }
    public int getMinute() {
        this.minute = minute;
        return minute;
    }
    public int getSecond() {
        this.second = second;
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond(){
        second++;
        if(second == 60){
            minute ++;
            second = 0;
            if(minute == 60){
                minute = 0;
                hour++;
                if(hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond(){
        second--;
        if (second <0){
            second = 59;
            minute--;
            if(minute <0){
                minute = 59;
            hour--;
            if(hour <0){
                hour = 23;
            }
            }
        }
        return this;
    }


}

