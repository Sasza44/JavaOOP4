package first.level;

public interface CSVConverter {
	public String toCSVString();
	public Student fromCSVString(String str);
}