package kr.or.bit;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Reservation { //예약 
    
    public Reservation() {
        // TODO Auto-generated constructor stub
    }
    //random도 여기서
    public Reservation(String customId,int price,int num){
    	this.customId = customId;
    	this.date = simpledateformat.format(calendar.getTime());
    	this.price = price;
    	this.num = num;
    	//(int)(Math.random()*100000)+500000
    } 
    
    
        
    
    
    private String customId; //회원 아이디
    //private SimpleDateFormat date; //예매 일자
    private String date; //예매 일자
    private int price; //관람료
    private int num; //예매번호
    
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy년MM월dd일HH시mm분");
    //비밀번호?
    //좌석?
    //공연 종류?
    
    public void reservationBallet1() {
        this.date = simpledateformat.format(calendar.getTime());
        this.num = (int)(Math.random()*100000)+500000;
        this.price = 30000;
        
    }
    
    public String getCustomId() {
        return customId;
    }
//    public SimpleDateFormat getDate() {
//        return date;
//    }
    public int getPrice() {
        return price;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    
    public int getNum() {
        return num;
    }
    
	public String getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "Reservation [customId=" + customId + ", date=" + date + ", price=" + price + ", num=" + num + "]";
	}
    
    
}//Reservation End
