package Day5311221class;

import java.util.Arrays;

public class SplitMethodinnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to pune";
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				cnt++;
			}
		}
		System.out.println(cnt);
		String[] a = new String[cnt + 1];
		int index = 0;
		for (int i = 0; i < s.length(); i++)
		{
			String s1 = "";
			int xj = 0;
			for (int j = i; j < s.length(); j++) 
			{
				if (s.charAt(j) != ' ')
				{
					s1 = s1 + s.charAt(j);
					xj = j;
				}
				else 
				{
					break;
				}

			}
			a[index++] = s1;
			i = xj + 1;
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
