public class SpaceRemoved{

public static String getSpaceRemovedString(String input){

	String spaceRemovedString = "";
	
	for(int index = 0; index < input.length(); index++){

	if(input.charAt(index) != ' '){

	spaceRemovedString = spaceRemovedString + input.charAt(index);


}

	}

	return spaceRemovedString;


}

	public static void main(String [] args){

	System.out.println(getSpaceRemovedString("theophilus is a guy"));
	}

	}