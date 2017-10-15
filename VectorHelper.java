package Class;

public class VectorHelper {
/**
 * Date : 14/10/2017
 *  @author dell
 *  @version 1.0
 * la classe VectorHelper assure les opérations suivantes :
 *   • Trier les éléments d’un vecteur
 *   • Sommer deux vecteurs. Elle génére une exception si les deux vecteurs ont des  tailles différentes
 *   • Inverser les éléments d’un vecteur
 *   • Obtenir simultanément le minimum et le maximum d’un vecteur
 *   • Appliquer une formule (multiplication par 10 ) sous forme de fonction à tous les éléments d’un vecteur
 *
 *
 */

	/**
	 * int valeur de la taille du vecteur
	 */
	private int taille;
	private int[] tab;
	private int max;
	private int min;
	/**
	 * Consctucteur de la classe VectorHelper
	 * @param tai
	 * @param tab
	 */
	public VectorHelper(int tai,int[] tab)
	{

		this.taille= tai;
		this.tab=tab;
		this.max = tab[0];
		this.min = tab[0];

	}

public void min_max()

{
	int i;
	for (i=0; i<this.taille; i++)
	{
		if (this.tab[i]>this.max) this.max = this.tab[i];
		if (this.tab[i]<this.min) this.min = this.tab[i];
	}

	}


public void multipl(int x)
{
	int i;
	for (i=0; i<this.taille; i++)
	{
		this.tab[i]=x*this.tab[i];
	}

	}
public void affich_vect()
{
int i ;
for (i=0; i<this.taille; i++)
{
 System.out.print(this.tab[i]+"|");
}
}

public void invert_vector()
{
	int tab1[] = new int[this.taille];
	int i,j=0;
	for (i=this.taille-1; i>=0; i--)
	{
		tab1[j]=this.tab[i];
		j++;
	}
	this.tab=tab1;
	}
public int get_min_vector()
{
	return(this.min);
}
public int get_max_vector()
{
	return(this.max);
}
public int get_taille()
{
	return(this.taille);
}
public int[] get_tab()
{
	return(this.tab);
}
public int get_tab_case(int i)
{
	return(this.tab[i]);
}
}
