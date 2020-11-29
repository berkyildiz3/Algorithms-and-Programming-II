
/**
 * @author Berk Yýldýz
 * 20.03.2017
 */
public interface Selectable {

	public boolean getSelected();
	public void setSelected(boolean a);
	public Shape contains(int x, int y);
}
