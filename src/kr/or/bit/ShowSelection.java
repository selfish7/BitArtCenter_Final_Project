package kr.or.bit;
import java.util.ArrayList;
import java.util.List;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ShowSelection.java
//  @ Date : 2020-03-25
//  @ Author : 
//
//




public class ShowSelection implements BitArtCenter {
	//public List<ShowInfo> showList = new ArrayList<ShowInfo>();
	public List<ShowInfo> showList = new ArrayList<ShowInfo>();
	ShowInfo showinfo = new ShowInfo();

	
	//공연별로 다 쪼개준다......
	
	public void Ballet1() { 
		showList.add(new ShowInfo("Ballet", "4.1", "19:00", "22:00", "1회차")); //[0]번째 방
	}//Ballet1() End
	
	public void Ballet2() {
	    showList.add(new ShowInfo("Ballet", "4.4", "19:00", "22:00", "2회차")); //[1]번째 방
    }//Ballet2() End
	
	public void Concert1() {
	    showList.add(new ShowInfo("Concert", "4.2", "19:00", "21:00", "1회차")); //[0]번째 방
	}// Concert1() End
	
	public void Concert2() {
        showList.add(new ShowInfo("Concert", "4.6", "19:00", "21:00", "2회차")); //[1]번째 방
    }// Concert2() End
	
	public void Opera1() {
	    showList.add(new ShowInfo("Opera", "4.3", "14:00", "17:00", "1회차")); //[0]번째 방
	}//Opera1() End
	
	public void Opera2() {
        showList.add(new ShowInfo("Opera", "4.5", "14:00", "17:00", "2회차")); //[1]번째 방
    }//Opera2() End
	
	public void Opera3() {
        showList.add(new ShowInfo("Opera", "4.7", "14:00", "17:00", "3회차")); //[2]번째 방
    }//Opera3() End
	
	
	
	
	//필요없는 놈1... interface를 상속받기 때문에 꼭 재정의를 해줘야 하는듯.
    @Override
    public void Ballet() {
    }
    //필요없는 놈2... interface를 상속받기 때문에 꼭 재정의를 해줘야 하는듯.
    @Override
    public void Concert() {
    }
    //필요없는 놈3... interface를 상속받기 때문에 꼭 재정의를 해줘야 하는듯.
    @Override
    public void Opera() {
    }


}//ShowSelection End
