package v004;
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
	
public class PermutationArrays_UVa482{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < t; j++)
		{
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = st.countTokens();
			int[] indexArray = new int[n];
			for(int i = 0; i < n; i++)
				indexArray[i] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			String[] x = new String[st.countTokens()];
			for(int i = 0; i < x.length; i++)
				x[i] = st.nextToken();
			String[] y = new String[x.length];
			for(int i = 0; i < x.length; i++)
				y[indexArray[i]-1] = x[i];
			for(int i = 0; i < y.length; i++)
				sb.append(y[i]+"\n");
			if(t-1!=j)
				sb.append("\n");
		}
		
		System.out.print(sb);
		
		
	}
	
}	