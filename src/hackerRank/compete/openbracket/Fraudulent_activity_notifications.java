package hackerRank.compete.openbracket;

import java.util.Scanner;

public class Fraudulent_activity_notifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int data[] = new int[n];
		int freq[] = new int[201];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
			if(i < d)
			{
				freq[data[i]]++;
			}
		}
		int first = 0,ans=0;
		if (d % 2 == 1)
		{

			for (int current = d; current < n; current++)
			{
				int median = 0;
				int now = (d / 2) ;
				for (int j = 0; j < 201; j++)
				{
					now = now - freq[j];
					if (now < 0)
					{
						median = j;
						break;
					}
				}
				freq[data[current]]++;
				freq[data[first]]--;
				first++;
				if(data[current]>=median*2)
					ans++;
				
			}
			System.out.println(ans);
		} else
		{
			for (int current = d; current < n; current++)
			{
				int median1 = 0;
				int median2 = 0;
				int now = (d / 2);
				for (int j = 0; j < 201; j++)
				{
					now = now - freq[j];
					if (now < 0)
					{
						median1 = j;
						break;
					}
				}
				now = (d / 2)-1;
				for (int j = 0; j < 201; j++)
				{
					now = now - freq[j];
					if (now < 0)
					{
						median2 = j;
						break;
					}
				}
				freq[data[current]]++;
				freq[data[first]]--;
				first++;
				if(data[current]>=median1+median2)
					ans++;
				
//				System.out.println(median1+" "+median2);
			}
			System.out.println(ans);
		}

	}

}
