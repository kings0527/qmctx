
package i3k.gs;

public class Force
{		
	public Force(GameServer gs, int id)
	{
		this.gs = gs;
		this.id = id;
	}
	
	final GameServer gs;
	final int id;
	int flag;
	int day; // ÿ��ˢ�±�ǩ
	String name;	
	long lastSaveTime = 0;
}

