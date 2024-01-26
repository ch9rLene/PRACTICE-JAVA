public class EqualNotEqual {
	public static void main(String[] args) {   
		int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;

    //First, create a variable called sameNumberOfSongs that stores whether the two albums have the same number of songs.
    boolean sameNumberOfSongs =  songsA == songsB;
    //Now, create a variable called differentLength that stores the result of checking whether the two album lengths are not the same.
    boolean differentLength = albumLengthA != albumLengthB;
	}
}

