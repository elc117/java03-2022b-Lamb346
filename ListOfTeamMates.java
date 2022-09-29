import java.util.ArrayList;

public class ListOfTeamMates{
	
	  private static final int MAX_TEAMMATES = 6;

  	public static void main(String[] args) {
    		ArrayList<TeamMates> list = new ArrayList<TeamMates>();
    		
    		list.add(new TeamMates("1","name1",false));
    		list.add(new TeamMates("2","name2",true));
    		list.add(new TeamMates("3","name3",false));
    		list.add(new TeamMates("4","name4",true));
    		
    		for (TeamMates item : list) {
      			System.out.println(item.getname());
    		}
    		
    		System.out.println("---");
    		
    		for (TeamMates item : list) {
    			boolean x = item.getonline();
    			if(x)
      			System.out.println(item.getuserid());
    		}
    	}
}
