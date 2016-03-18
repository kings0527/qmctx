
package i3k.gm;

import java.util.List;

import ket.util.Stream;

public interface Service
{
	public static class ServiceException extends Exception
	{
		public ServiceException(String msg)
		{
			super(msg);
		}
	}
	
	public static class ServiceConfig
	{
		/**
		 * ��������ַ
		 */
		public String host;
		/**
		 * �������˿�
		 */
		public int port;
		/**
		 * ����·��
		 */
		public String cfgPath;
	}
	
	/**
	 * ��ɫ������Ϣ
	 */
	public static class RoleBrief
	{
		/**
		 * roleID
		 */
		public int id;
		/**
		 * ��ɫ��
		 */
		public String name;
		/**
		 * �˺���
		 */
		public String uname;
		/**
		 * �ȼ�
		 */
		public short level;
		/**
		 * ��Ǯ
		 */
		public int money;
		/**
		 * ��ʯ
		 */
		public int stone;
		/**
		 * �佫����
		 */
		public int gcount;
		/**
		 * ��������
		 */
		public int icount;
		/**
		 * װ������
		 */
		public int ecount;
		/**
		 * �������
		 */
		public int jianghunPoint;
	}
	
	/**
	 * װ��������Ϣ
	 */
	public static class EquipBrief
	{
		/**
		 * equipID
		 */
		public short id;
		/**
		 * װ������
		 */
		public short count;
	}
	
	/**
	 * ���߻�����Ϣ
	 */
	public static class ItemBrief
	{
		/**
		 * itemID
		 */
		public short id;
		/**
		 * ��������
		 */
		public int count;
	}
	
	/**
	 * �佫������Ϣ
	 */
	public static class GeneralBrief
	{
		/**
		 * generalID
		 */
		public short id;
		/**
		 * �ȼ�
		 */
		public short lvl;
		/**
		 * ���׵ȼ�
		 */
		public byte advLvl;
		/**
		 * �����ȼ�
		 */
		public byte evoLvl;
	}
	
	/**
	 * �佫װ����Ϣ
	 */
	public static class GeneralEquip
	{
		/**
		 * generalID
		 */
		public short generalID;
		/**
		 * equipID
		 */
		public short equipID;
	}
	
	/**
	 * ��ʼ��
	 */
	public void init(ServiceConfig cfg);
	
	/**
	 * ����
	 */
	public void destroy();
	
	/**
	 * �����˺���ȡ�� roleID
	 * @return <=0 ˵��û�ҵ�
	 */
	public int getRoleIDByUserName(String uname) throws ServiceException;
	
	/**
	 * ���ݽ�ɫ��ȡ�� roleID
	 * @return <=0 ˵��û�ҵ�
	 */
	public int getRoleIDByRoleName(String rname) throws ServiceException;
	
	/**
	 * ȡ����������
	 */
	public int getOnlineCount() throws ServiceException;
	
	/**
	 * ȫ�����ŵ��ߣ������ڷ���ʱ��֮ǰע����û��ӷ���ʱ�򵽳���ʱ�����֮���¼��ͨ���ʼ��յ���ֻ�յ�һ�δ˵���
	 * @param itemID ����ID
	 * @param time ����ʱ�䣨�룩
	 * @param mail �����ʼ�����
	 */
	public boolean addWorldGift(short itemID, int time, String mail) throws ServiceException;
	
	/**
	 * ������Ϸ��
	 * @param roleID
	 * @param money
	 * @param mail 1:�����ʼ�����  0:������
	 * @return 0: �ɹ�
	 */
	public byte addMoney(int roleID, int money, byte mail) throws ServiceException;
	
	/**
	 * ������ʯ
	 * @param roleID
	 * @param stone
	 * @param mail 1:�����ʼ�����  0:������
	 * @return 0: �ɹ�
	 */
	public byte addStone(int roleID, int stone, byte mail) throws ServiceException;
	
	/**
	 * ���ŵ���
	 * @param roleID
	 * @param id ����ID
	 * @param cnt ����
	 * @param mail 1:�����ʼ�����  0:������
	 * @return 0: �ɹ�
	 */
	public byte addItem(int roleID, short id, int cnt, byte mail) throws ServiceException;
	
	/**
	 * ����װ��
	 * @param roleID
	 * @param id װ��ID
	 * @param cnt ����
	 * @param mail 1:�����ʼ�����  0:������
	 * @return 0: �ɹ�
	 */
	public byte addEquip(int roleID, short id, int cnt, byte mail) throws ServiceException;
	
	/**
	 * �����佫
	 * @param roleID
	 * @param id �佫ID
	 * @param mail 1:�����ʼ�����  0:������
	 * @return 0: �ɹ�
	 */
	public byte addGeneral(int roleID, short id, byte mail) throws ServiceException;
	
	/**
	 * �޸ľ�Ԫ
	 * @param roleID
	 * @param id �佫ID
	 * @param mail 1:�����ʼ�����  0:������
	 * @return 0: �ɹ�
	 */
	public byte modSeyen(int roleID, short id, int cnt, byte mail) throws ServiceException;
	
	/**
	 * �����ʼ�
	 * @param roleID
	 * @param content ����
	 * @return 0: �ɹ�
	 */	
	public byte sendMail(int roleID, String content) throws ServiceException;
	
	/**
	 * ���͹㲥
	 * @param times ���ż���
	 * @param content ����
	 * @return 0: �ɹ�
	 */	
	public byte announce(byte times, String content) throws ServiceException;
	
	/**
	 * ȡ�ý�ɫ������Ϣ
	 * @param roleID roleID
	 * @return not null: �ɹ�
	 */	
	public RoleBrief getRoleBrief(int roleID) throws ServiceException;
	
	/**
	 * ȡ��װ����Ϣ
	 * @param roleID roleID
	 * @return not null: �ɹ�
	 */	
	public List<EquipBrief> getEquips(int roleID) throws ServiceException;
	
	/**
	 * ȡ�õ�����Ϣ
	 * @param roleID roleID
	 * @return not null: �ɹ�
	 */	
	public List<ItemBrief> getItems(int roleID) throws ServiceException;
	
	/**
	 * ȡ���佫��Ϣ
	 * @param roleID roleID
	 * @return not null: �ɹ�
	 */	
	public List<GeneralBrief> getGenerals(int roleID) throws ServiceException;
	
	/**
	 * ȡ���佫װ����Ϣ
	 * @param roleID roleID
	 * @return not null: �ɹ�
	 */	
	public List<GeneralEquip> getGeneralEquips(int roleID) throws ServiceException;
	
	/**
	 * ȡ���佫����
	 * @param gid �佫ID
	 */
	public String getGeneralName(short gid) throws ServiceException;
	
	/**
	 * ȡ��װ��
	 * @param eid װ��ID
	 */
	public String getEquipName(short eid) throws ServiceException;
	
	/**
	 * ȡ�õ�������
	 * @param iid ����ID
	 */
	public String getItemName(short iid) throws ServiceException;
}
