
public class OrdreChaineMatrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] m = new double [6][6];
		double s [][] = new double [6][6];
		double p [] = {30,35,15,5,10,20,25};

		initTab(m);
		initTab(s);

		for(int i = 1; i<m.length; i++)
		{
			m[i][i] = 0;
		}
		for(int l = 2; l<m.length; l++)
		{
			for(int i = 1; l<m.length + 1; l++)
			{
				int j = i + l - 1;
				m[i][i] = m.length;

				for(int k = i; k<j - 1; k++)
				{
					double q = m[i][k] + m[k+1][j]+p[i-1]*p[k]*p[j];
					
					if(k==i)
					{
						m[i][j]=q;
					}

					if(q < m[i][j])
					{
						m[i][j]=q;
						s[i][j]=k;
					}
				}
			}

		}
		System.out.println("Matrice m :");
		afficher(m);
		System.out.println("Matrice s :");
		afficher(s);

	}

	private static void afficher(double[][] tab) {
		// TODO Auto-generated method stub

		for(int x = 0; x<tab.length; x++)
		{
			//System.out.println(x + " ");
			for(int y = 0; y<tab.length; y++)
			{
				//System.out.println(y + " ");
				System.out.print(tab[x][y]+" ");
			}

		}
	}
	private static void initTab(double[][] tab) {
		// TODO Auto-generated method stub

		for(int x = 0; x<tab.length; x++)
		{
			for(int y = 0; y<tab.length; y++)
			{
				tab[x][y] = 1;
			}

		}
	}

}
