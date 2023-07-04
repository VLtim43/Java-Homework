package TP;

public class convertTime {
	public  static String secTomin(long l) {
		int totalSecs = (int) l;
		int hours = totalSecs / 3600;
		int minutes = (totalSecs % 3600) / 60;
		int seconds = totalSecs % 60;

		 String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		return timeString;
	}
}

