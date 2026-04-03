package interview_programs2026;

public class String_ReplaceAll {

	public static void main(String[] args)
	{
		String s1 = "@#@&^&&)(*&*&@ HArjeet@ 12345";
		 String s2 =   s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);

	}

}
