// modified by i3k.gtool.QQMetaGen at Thu Mar 17 10:14:53 CST 2016.

package i3k;

import ket.util.Stream;

public final class TLog
{

	// gmɾ������
	public static final int AT_GM_DEL_ITEM = 1;
	// gm���ŵ���
	public static final int AT_GM_ADD_ITEM = 2;
	// gm�޸ľ���
	public static final int AT_GM_MODIFY_EXP = 3;
	// gm�޸���ʯ
	public static final int AT_GM_MODIFY_DIAMOND = 4;
	// gm�޸���Ϸ��
	public static final int AT_GM_MODIFY_MONEY = 5;
	// gm�޸�����
	public static final int AT_GM_MODIFY_VIT = 6;
	// gmɾ��װ��
	public static final int AT_GM_DEL_EQUIP = 7;
	// gm����װ��
	public static final int AT_GM_ADD_EQUIP = 8;
	// gm�������
	public static final int AT_GM_CLEAR_DATA = 9;
	// ����
	public static final int AT_LEVEL_UP = 99;
	// ϵͳ����
	public static final int AT_SYS_REWARD = 100;
	// ȫ������
	public static final int AT_WORLD_REWARD = 101;
	// ����ֹ�����
	public static final int AT_BUY_MONEY = 110;
	// ��������
	public static final int AT_BUY_VIT = 111;
	// �����ܵ�
	public static final int AT_BUY_SKILLPOINT = 112;
	// ��ͨ�ƽ���鿨
	public static final int AT_GOLD_EGG = 115;
	// 10���ƽ���鿨
	public static final int AT_GOLD_EGG10 = 116;
	// ��ͨ��ͭ����鿨
	public static final int AT_BRONZE_EGG = 117;
	// 10����ͭ����鿨
	public static final int AT_BRONZE_EGG10 = 118;
	// ��ϻ�鿨
	public static final int AT_SOUL_BOX = 119;
	// �̳�����
	public static final int AT_SHOP_BUY = 120;
	// �̳�ˢ��
	public static final int AT_SHOP_REFRESH = 121;
	// ���������ٻ�
	public static final int AT_SHOP_SUMMON = 122;
	// ս�ۿ�ʼ
	public static final int AT_COMBAT_START = 130;
	// ս�۽���
	public static final int AT_COMBAT_FINISH = 131;
	// ս������
	public static final int AT_COMBAT_SKIP = 132;
	// ս������
	public static final int AT_COMBAT_RESET = 133;
	// ���ս�ۿ�ʼ
	public static final int AT_CHIBI_START = 134;
	// ���ս�۽���
	public static final int AT_CHIBI_FINISH = 135;
	// ������������ʼ
	public static final int AT_BAGUAZHENG_START = 136;
	// ��������������
	public static final int AT_BAGUAZHENG_FINISH = 137;
	// ���ս��ɨ��
	public static final int AT_CHIBI_SKIP = 138;
	// ����������ɨ��
	public static final int AT_BAGUAZHENG_SKIP = 139;
	// ��������������������ս����
	public static final int AT_ARENA_BUY_TIMES = 140;
	// �������������������ȴ
	public static final int AT_ARENA_CLEAR_COOL = 141;
	// ����������������ս����
	public static final int AT_ARENA_FINISH = 142;
	// ����ն������
	public static final int AT_MARCH_REWARD = 143;
	// ����ն������
	public static final int AT_MARCH_FINISH = 144;
	// ��ȡ���������н���
	public static final int AT_SUPER_ARENA_REWARD = 145;
	// ����������ս��
	public static final int AT_SUPER_ARENA_HIDE_TEAMS = 146;
	// ����ն��ɨ��
	public static final int AT_MARCH_SKIP = 147;
	// �佫�״ν���
	public static final int AT_GENERAL_FIRST_EVOLUTION = 150;
	// �佫����
	public static final int AT_GENERAL_EVOLUTION = 151;
	// �佫��������
	public static final int AT_GENERAL_UPGRADE_SKILL = 152;
	// װ���佫
	public static final int AT_GENERAL_SET_EQUIP = 153;
	// װ���ƽ�
	public static final int AT_GENERAL_EQUIP_GILD = 154;
	// ���ǿ��
	public static final int AT_GENERAL_WEAPON_ENHANCE = 155;
	// �������
	public static final int AT_GENERAL_WEAPON_ADVANCE = 156;
	// ���ϴ��
	public static final int AT_GENERAL_WEAPON_RESET = 157;
	// �佫����
	public static final int AT_GENERAL_ADV = 158;
	// �������
	public static final int AT_PET_EVOLUTION = 160;
	// ���ﷱֳ
	public static final int AT_PET_BREED = 161;
	// ������������
	public static final int AT_PET_POUND_UPGRADE = 162;
	// ����ιʳ
	public static final int AT_PET_FEED = 163;
	// �������
	public static final int AT_PET_PRODUCE = 164;
	// �������ι��
	public static final int AT_DEFORM_PET_FEED = 165;
	// �����������
	public static final int AT_DEFORM_PET_BEG_LIKE = 166;
	// ����������
	public static final int AT_DEFORM_PET_LIKE = 167;
	// �������弶
	public static final int AT_DEFORM_PET_TRY_UPGRADE = 168;
	// ��������弶����
	public static final int AT_DEFORM_PET_BUY_TRY_TIMES = 169;
	// �������
	public static final int AT_PET_AWAKE = 170;
	// ǩ��
	public static final int AT_CHECKIN = 200;
	// ÿ������
	public static final int AT_DAILY_GIFT = 201;
	// �������
	public static final int AT_FINISH_TASK = 202;
	// �ճ�������
	public static final int AT_DAILY_TASK_REWARD = 205;
	// װ���ϳ�
	public static final int AT_EQUIP_COMBINE = 210;
	// ���ߺϳ�
	public static final int AT_ITEM_COMBINE = 211;
	// װ������
	public static final int AT_EQUIP_SELL = 220;
	// ���߳���
	public static final int AT_ITEM_SELL = 221;
	// ����ʹ��
	public static final int AT_ITEM_USE = 222;
	// �԰���
	public static final int AT_EAT_BUNS = 230;
	// ���������
	public static final int AT_TAKE_FRIEND_ITEM = 231;
	// ������Ǯ
	public static final int AT_TAKE_FRIEND_BREED_REWARD = 232;
	// �����ٻ�
	public static final int AT_RECALL = 233;
	// ����
	public static final int AT_CHAT = 234;
	// �������Ļ��ս������
	public static final int AT_BUY_WARGOODS = 237;
	// �������Ļ����
	public static final int AT_TRADING_CENTER = 238;
	// �ۻ���¼�����
	public static final int AT_LOGIN_GIFT = 239;
	// ǩ����������
	public static final int AT_CEHCKIN_GIFT = 240;
	// �׳���������
	public static final int AT_FIRST_PAY_GIFT = 241;
	// �����һ������
	public static final int AT_EXCHANGE_GIFT_PACKAGE = 242;
	// ������������
	public static final int AT_CONSUME_GIFT = 243;
	// ���ѷ��������
	public static final int AT_CONSUME_REBATE = 244;
	// ������������
	public static final int AT_UPGRADE_GIFT = 245;
	// �ռ��һ������
	public static final int AT_EXCHANGE_GIFT = 246;
	// ������������
	public static final int AT_GATHER_GIFT = 247;
	// ��ֵ��������
	public static final int AT_PAY_GIFT = 248;
	// ��ʱ�̳�������
	public static final int AT_LIMITED_GIFT = 249;
	// �û���ֵ
	public static final int AT_USER_PAY = 250;
	// ��ģʽ��ֵ
	public static final int AT_GOD_PAY = 251;
	// ���ս����
	public static final int AT_CITY_REWARD = 260;
	// ���ս����
	public static final int AT_CITY_SEARCH = 261;
	// ���ս����ʧ�ܷ���
	public static final int AT_CITY_SEARCH_FAILED_RETURN = 262;
	// ����������������
	public static final int AT_RICH_DAILYTASK = 270;
	// ��������������
	public static final int AT_RICH_DICE = 271;
	// �������µ�·�¼�
	public static final int AT_RICH_ROAD = 272;
	// �������¿�����
	public static final int AT_RICH_MINE = 273;
	// ��������ռ����
	public static final int AT_RICH_DIVINE = 274;
	// ����������·
	public static final int AT_RICH_BYPASS = 275;
	// �������¿Ƽ���
	public static final int AT_RICH_TECHTREE = 276;
	// �����������ж���
	public static final int AT_RICH_BUYMOVEMENT = 277;
	// �������¾۱���boss
	public static final int AT_RICH_BOSS = 278;
	// ��������ռ���
	public static final int AT_RICH_OCCUPY_MINE = 279;
	// �������������
	public static final int AT_INVITATION_TASK = 290;
	// ������ѻ��ֽ���
	public static final int AT_INVITATION_POINTS = 291;
	// ����������ѽ���
	public static final int AT_INVITATION_REWARD = 292;
	// qq��Ա����
	public static final int AT_QQ_VIP_REWARD = 295;
	// ���ͻ���
	public static final int AT_BESTOW_ITEM = 401;
	// ���̻����
	public static final int AT_DISKBET = 402;
	// �Ƕ�������
	public static final int AT_DUELBUYTIME = 403;
	// ����BOSS����
	public static final int AT_EXPIRAT_BOSS = 404;
	// ȺӢ�Ứ��
	public static final int AT_HERO_BOSS = 405;
	// �����������
	public static final int AT_PET_CHANGE_NAME = 406;
	// ��ְ����
	public static final int AT_RESET_OFFICIAL = 407;
	// ��ְ���ܻ���
	public static final int AT_RESET_OFFCIAL_SKILL = 408;
	// ���̻���
	public static final int AT_RICH_LOTERY = 409;
	// ��������ʱ�仨��
	public static final int AT_SUPER_CLEAR = 410;
	// �Ƕ��������佫����
	public static final int AT_SURA_ACTIVE = 411;
	// ������ʯϴ������
	public static final int AT_GENERAL_STONE_RETPROP = 412;
	// �ر�ͼ����
	public static final int AT_TREASURE_MAP_USE = 300;
	// �ر�ͼ�ڱ�
	public static final int AT_TREASURE_MAP_DIG = 301;
	// ���Ǵ�ħ�����Ļ���
	public static final int AT_BEMONSTER_REGISTER = 501;
	// ���Ǵ�ħ����������Ѫ������
	public static final int AT_BEMONSTER_UPHP = 502;
	// ��������
	public static final int AT_CREATE_FORCE = 1000;
	// ����Ĥ��
	public static final int AT_FORCE_WORSHIP = 1001;
	// ����Ĥ�ݽ���
	public static final int AT_FORCE_WORSHIP_REWARD = 1002;
	// ���ҹ��׽���
	public static final int AT_FORCE_CONTRIBUTION_REWARD = 1003;
	// ���ٹ�ս����
	public static final int AT_FORCE_WAR_DESTORY_ITEMS = 1004;
	// ���׹�ս����
	public static final int AT_FORCE_WAR_CONTRIBUTE = 1005;
	// ���ù������޷�������
	public static final int AT_FORCE_RESET_BEAST_DEFENSE = 1006;
	// ϴ���������޹�������
	public static final int AT_FORCE_RESET_BEAST_ATTACK = 1007;
	// ιʳ��������
	public static final int AT_FORCE_FEED_BEAST = 1008;
	// ����ս������
	public static final int AT_SURA_FINISH = 2001;
	// BOSSս����
	public static final int AT_EXPIRATBOSS_FINISH = 2002;
	// �������¿�����
	public static final int AT_RICH_OPENBOX = 2003;
	// ��Ԫע��
	public static final int AT_SEYEN_ADD = 2004;
	// ��ԪɢԪ
	public static final int AT_SEYEN_REVERT = 2005;
	// Ե������
	public static final int AT_RELATION_UPGRADE = 2006;
	// Ե�ּ���
	public static final int AT_RELATION_ACTIVATE = 2007;
	// �����սս������
	public static final int AT_FORCE_SWAR_FINISH = 2008;

	// ����
	public static final int COMMON_TYPE_EXP = -10;
	// ����
	public static final int COMMON_TYPE_VIT = -8;
	// ���̳��
	public static final int COMMON_TYPE_RICH_GOLD = -7;
	// ���̻��ҵ���
	public static final int COMMON_TYPE_RICH = -6;
	// ���һ��ҵ���
	public static final int COMMON_TYPE_FORCE = -5;
	// ����ն�����ҵ���
	public static final int COMMON_TYPE_MARCH = -4;
	// ���������ҵ���
	public static final int COMMON_TYPE_ARENA = -3;
	// ��ʯ
	public static final int COMMON_TYPE_DIAMOND = -2;
	// ��Ǯ
	public static final int COMMON_TYPE_MONEY = -1;
	// ����
	public static final int COMMON_TYPE_ITEM = 0;
	// װ��
	public static final int COMMON_TYPE_EQUIP = 1;
	// �佫
	public static final int COMMON_TYPE_GENERAL = 2;
	// ����
	public static final int COMMON_TYPE_PET = 3;

	// ��ͨս��
	public static final int BATTLE_COMMON = 0;
	// Ӣ��ս��
	public static final int BATTLE_HERO = 1;

	// ��ͨս��
	public static final int COMBAT_COMMON = 0;
	// ɨ��ս��
	public static final int COMBAT_SKIP = 1;

	// սʤ
	public static final int ARENARE_WIN = 0;
	// ս��
	public static final int ARENARE_LOSE = 1;

	// ƽ������,�������ս��10��
	public static final int DAILYTASK_BATTLE_ANY = 1;
	// �������,�������Ӣ��ս��3��
	public static final int DAILYTASK_BATTLE_HERO = 2;
	// ��Դ����,�����¿���ÿ����ȡ120��
	public static final int DAILYTASK_BATTLE_MONTHLY_CARD = 3;
	// ��տ����,��������Ӣ�ۼ���3��
	public static final int DAILYTASK_BATTLE_UPGRADE_GENERAL_SKILL = 4;
	// ����Ѱ��,���5��̽��
	public static final int DAILYTASK_BATTLE_EGG = 5;
	// �������,������װ���ƽ�����1��
	public static final int DAILYTASK_BATTLE_GILD = 6;
	// ��̨����,�ھ����������3����ս
	public static final int DAILYTASK_BATTLE_ARENA = 7;
	// ����ն��,�ڹ���ն����սʤһ�ε���
	public static final int DAILYTASK_BATTLE_MARCH = 8;
	// ���֮ս,���2�γ��֮ս
	public static final int DAILYTASK_BATTLE_CHIBI = 9;
	// ��������,���3�ΰ���������
	public static final int DAILYTASK_BATTLE_BAGUAZHEN = 10;
	// ���������,ÿ��12:00��14��00������ȡ60������
	public static final int DAILYTASK_BATTLE_FREE_VIT1 = 11;
	// ���������,ÿ��12:00��14��00������ȡ60������
	public static final int DAILYTASK_BATTLE_FREE_VIT2 = 12;
	// ������ҹ��,ÿ��12:00��14��00������ȡ60������
	public static final int DAILYTASK_BATTLE_FREE_VIT3 = 13;
	// ��ʯ�ɽ�,ʹ��һ��ҡǮ��
	public static final int DAILYTASK_BATTLE_BUY_MONEY = 14;
	// �и�ͬ��,��������5������
	public static final int DAILYTASK_BATTLE_SEND_BUNS = 15;
	// ����˲��,����һ�ξ���˲��
	public static final int DAILYTASK_BATTLE_SHOW_OFF = 16;

	// ��ͭ����
	public static final int CHEST_BRONZE = 0;
	// �ƽ���
	public static final int CHEST_GOLD = 1;
	// ��ϻ����
	public static final int CHEST_SOUL = 2;

	// ��Ǯ
	public static final int CHEST_PRICE_UNIT_MONEY = 1;
	// ��ʯ
	public static final int CHEST_PRICE_UNIT_DIAMOND = 2;

	// ��Ǯ
	public static final int SHOP_PRICE_UNIT_MONEY = 0;
	// ��ʯ
	public static final int SHOP_PRICE_UNIT_DIAMOND = 1;
	// ����������
	public static final int SHOP_PRICE_UNIT_ARENA = 2;
	// ����ն������
	public static final int SHOP_PRICE_UNIT_MARCH = 3;

	// ����������
	public static final int GENERALEBATTLE_ARENA_DEFENSE = 0;
	// ����������
	public static final int GENERALEBATTLE_ARENA_ATTACK = 1;
	// ��ͨս��
	public static final int GENERALEBATTLE_NORMAL_BATTLE = 2;
	// Ӣ��ս��
	public static final int GENERALEBATTLE_HERO_BATTLE = 3;
	// ����ն��
	public static final int GENERALEBATTLE_MARCH = 4;
	// ���֮ս
	public static final int GENERALEBATTLE_CHIBI = 5;
	// ������
	public static final int GENERALEBATTLE_BAGUAZHEN = 6;

	// �佫����
	public static final int GENERALEVOLUTION_LEVELUP = 1;
	// �佫����
	public static final int GENERALEVOLUTION_STARUP = 2;
	// �佫����
	public static final int GENERALEVOLUTION_ADVUP = 3;

	// ����Ĥ��
	public static final int FORCE_WORSHIP = 1;
	// ����Ĥ���콱
	public static final int FORCE_WORSHIP_REWARD = 2;
	// ���ҹ����콱
	public static final int FORCE_CONTRIBUTION_REWARD = 3;
	// ����Ƶ������
	public static final int FORCE_CHAT = 4;
	// ������������
	public static final int FORCE_SET_ANNOUNCEMENT = 5;
	// ��������ͼ��
	public static final int FORCE_SET_ICON = 6;
	// ���Ҵ���
	public static final int FORCE_CREATE = 7;
	// ���Ҿܾ���������
	public static final int FORCE_REFUSE = 8;
	// ����ͬ���������
	public static final int FORCE_ACCEPT = 9;
	// �������ó�Աְλ
	public static final int FORCE_SET_POSITION = 10;
	// ���ҹ�������
	public static final int FORCE_PASS_POSITION = 11;
	// �����߳���Ա
	public static final int FORCE_KICK = 12;
	// �����˳�
	public static final int FORCE_QUIT = 13;
	// ���ҽ�ɢ
	public static final int FORCE_DISMISS = 14;
	// ��������׼������
	public static final int FORCE_SET_JOIN = 15;
	// ����������ս,��ʱiEventArg1Ϊ��ǰ��սIDֵ��iEventArg2Ϊ��ǰ��������
	public static final int FORCE_WAR_OPEN = 20;
	// ���ұ�����ս,��ʱiEventArg1Ϊ��ǰ��սIDֵ��iEventArg2Ϊ��ǰ��������
	public static final int FORCE_WAR_JOIN = 21;
	// ��ս��������,��ʱiEventArg1Ϊ��ǰ��սIDֵ��iEventArg2Ϊ��ǰ��������
	public static final int FORCE_WAR_CONTRIBUTE = 22;
	// ����������ս��ս����,��ʱiEventArg1Ϊ��ǰ��սIDֵ��iEventArg2Ϊ��ǰ��������
	public static final int FORCE_WAR_CHANGE_SEQ = 23;
	// ��ս����,��ʱiEventArg1Ϊ��ǰ��սIDֵ��iEventArg2Ϊ0
	public static final int FORCE_WAR_QUIZ = 26;

	// �¿�
	public static final int PAY_LEVEL_MONTHCARD = 0;
	// 6Ԫ��λ
	public static final int PAY_LEVEL_1 = 1;
	// �׳�6Ԫ˫����λ
	public static final int PAY_LEVEL_FIRST_1 = -1;
	// 30Ԫ��λ
	public static final int PAY_LEVEL_2 = 2;
	// �׳�30Ԫ˫����λ
	public static final int PAY_LEVEL_FIRST_2 = -2;
	// 68Ԫ��λ
	public static final int PAY_LEVEL_3 = 3;
	// �׳�68Ԫ˫����λ
	public static final int PAY_LEVEL_FIRST_3 = -3;
	// 128Ԫ��λ
	public static final int PAY_LEVEL_4 = 4;
	// �׳�128Ԫ˫����λ
	public static final int PAY_LEVEL_FIRST_4 = -4;
	// 258Ԫ��λ
	public static final int PAY_LEVEL_5 = 5;
	// �׳�258Ԫ˫����λ
	public static final int PAY_LEVEL_FIRST_5 = -5;
	// 648Ԫ��λ
	public static final int PAY_LEVEL_6 = 6;
	// �׳�648Ԫ˫����λ
	public static final int PAY_LEVEL_FIRST_6 = -6;
	// ��ֵ����
	public static final int PAY_LEVEL_RETURN = 100;
	// ϵͳ����
	public static final int PAY_LEVEL_PRESENT = 101;

	// ��ҫ
	public static final int SNS_SHOWOFF = 1;
	// �������
	public static final int SNS_INVITE = 2;
	// �ٻغ���
	public static final int SNS_RECALL = 3;
	// ���Ͱ���
	public static final int SNS_SENDBUNS = 4;
	// ��ȡ����
	public static final int SNS_RECEICEBUNS = 5;
	// ���;������
	public static final int SNS_SENDEXPITEMS = 6;
	// ��ȡ�������
	public static final int SNS_RECEICEEXPITEMS = 7;
	// ���ͽ��
	public static final int SNS_SENDMONEY = 8;
	// ��ȡ���
	public static final int SNS_RECEICEMONEY = 9;

	// ��������
	public static final int PETPOUNDEVENT_UPGRADE = 1;
	// �����������
	public static final int PETPOUNDEVENT_PETPUT = 2;
	// ��������ȡ��
	public static final int PETPOUNDEVENT_PETGET = 3;
	// ����ιʳ����
	public static final int PETPOUNDEVENT_FEED = 4;
	// ���;��鵤
	public static final int PETPOUNDEVENT_SENDEXPITEMS = 5;

	// פ���佫, iEventType=CITYWAREVENT_GUARDʱ,iEventArg1ȡ-1(פ�ض�ȡ������ҵĳǳ�),0(פ�سǳػ���),1(�״�פ��1Сʱ),2(�״�פ��4Сʱ),3(�״�פ��8Сʱ)
	public static final int CITYWAREVENT_GUARD = 1;
	// �����ǳ�
	public static final int CITYWAREVENT_SEARCH = 2;
	// ����
	public static final int CITYWAREVENT_ATTACK = 3;
	// �콱
	public static final int CITYWAREVENT_REWARD = 4;

	// ս��
	public static final int SEC_ROUND_BATTLE = 1;
	// ���֮ս
	public static final int SEC_ROUND_CHIBI = 2;
	// ������
	public static final int SEC_ROUND_BAGUA = 3;
	// ����ն��
	public static final int SEC_ROUND_MARCH = 4;

	// ��ͨս��
	public static final int SEC_BATTLE_COMMON = 1;
	// Ӣ��ս��
	public static final int SEC_BATTLE_HERO = 2;

	// �ݴ����
	public static final int SEC_CHIBI_GRASSBOARD = 1;
	// ���ճ��
	public static final int SEC_CHIBI_CHIBI = 2;

	// ����
	public static final int SEC_BAGUA_LIFE = 1;
	// ����
	public static final int SEC_BAGUA_DEATH = 2;

	// ������
	public static final int SEC_IMMUNE_NONE = 0;
	// ��������
	public static final int SEC_IMMUNE_PHYSICAL = 1;
	// ħ������
	public static final int SEC_IMMUNE_MAGIC = 2;

	// �ʼ�˽��
	public static final int SEC_TALK_MAIL = 0;
	// ��������
	public static final int SEC_TALK_CHAT = 1;
	// �޸�ǩ��
	public static final int SEC_TALK_NAME = 10;
	// �޸Ĺ���
	public static final int SEC_TALK_ANNOUNCE = 11;



	// (��ѡ)���ע��
	public static class PlayerRegister
	{

		public PlayerRegister() { }

		public PlayerRegister(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                      int iPlatID, String vopenid, int iRoleID, String vClientVersion, 
		                      String vSystemSoftware, String vSystemHardware, String vTelecomOper, String vNetwork, 
		                      int iScreenWidth, int iScreenHight, float fDensity, int iRegChannel, 
		                      String vCpuHardware, int iMemory, String vGLRender, String vGLVersion, 
		                      String vDeviceId)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.vClientVersion = vClientVersion;
			this.vSystemSoftware = vSystemSoftware;
			this.vSystemHardware = vSystemHardware;
			this.vTelecomOper = vTelecomOper;
			this.vNetwork = vNetwork;
			this.iScreenWidth = iScreenWidth;
			this.iScreenHight = iScreenHight;
			this.fDensity = fDensity;
			this.iRegChannel = iRegChannel;
			this.vCpuHardware = vCpuHardware;
			this.iMemory = iMemory;
			this.vGLRender = vGLRender;
			this.vGLVersion = vGLVersion;
			this.vDeviceId = vDeviceId;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerRegister");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(vClientVersion);
			sb.append('|').append(vSystemSoftware);
			sb.append('|').append(vSystemHardware);
			sb.append('|').append(vTelecomOper);
			sb.append('|').append(vNetwork);
			sb.append('|').append(iScreenWidth);
			sb.append('|').append(iScreenHight);
			sb.append('|').append(fDensity);
			sb.append('|').append(iRegChannel);
			sb.append('|').append(vCpuHardware);
			sb.append('|').append(iMemory);
			sb.append('|').append(vGLRender);
			sb.append('|').append(vGLVersion);
			sb.append('|').append(vDeviceId);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����,ѭ��ʹ��
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0 /android 1
		public int iPlatID;
		// (����)�û�OPENID��
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// (��ѡ)�ͻ��˰汾
		public String vClientVersion;
		// (��ѡ)�ƶ��ն˲���ϵͳ�汾
		public String vSystemSoftware;
		// (��ѡ)�ƶ��ն˻���
		public String vSystemHardware;
		// (����)��Ӫ��
		public String vTelecomOper;
		// (��ѡ)3G/WIFI/2G
		public String vNetwork;
		// (��ѡ)��ʾ�����
		public int iScreenWidth;
		// (��ѡ)��ʾ���߶�
		public int iScreenHight;
		// (��ѡ)�����ܶ�
		public float fDensity;
		// (����)ע������
		public int iRegChannel;
		// (��ѡ)cpu����|Ƶ��|����
		public String vCpuHardware;
		// (��ѡ)�ڴ���Ϣ��λM
		public int iMemory;
		// (��ѡ)opengl render��Ϣ
		public String vGLRender;
		// (��ѡ)opengl�汾��Ϣ
		public String vGLVersion;
		// (��ѡ)�豸ID
		public String vDeviceId;
	}

	// (����)��ҵ�½
	public static class PlayerLogin
	{

		public PlayerLogin() { }

		public PlayerLogin(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                   int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                   int iVipLvl, int iPay, String vClientVersion, String vSystemHardware, 
		                   String vTelecomOper, String vNetwork, int iLoginChannel, int iForceID)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.vClientVersion = vClientVersion;
			this.vSystemHardware = vSystemHardware;
			this.vTelecomOper = vTelecomOper;
			this.vNetwork = vNetwork;
			this.iLoginChannel = iLoginChannel;
			this.iForceID = iForceID;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerLogin");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(vClientVersion);
			sb.append('|').append(vSystemHardware);
			sb.append('|').append(vTelecomOper);
			sb.append('|').append(vNetwork);
			sb.append('|').append(iLoginChannel);
			sb.append('|').append(iForceID);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)�û�OPENID��
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// (����)�ȼ�
		public int iLevel;
		// (����)��ɫvip�ȼ�
		public int iVipLvl;
		// (����)��ɫ��ֵ����
		public int iPay;
		// (����)�ͻ��˰汾
		public String vClientVersion;
		// (����)�ƶ��ն˻���
		public String vSystemHardware;
		// (����)��Ӫ��
		public String vTelecomOper;
		// (����)3G/WIFI/2G
		public String vNetwork;
		// (����)��¼����
		public int iLoginChannel;
		// (����)��������ID������0
		public int iForceID;
	}

	// (����)��ҵǳ�
	public static class PlayerLogout
	{

		public PlayerLogout() { }

		public PlayerLogout(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                    int iPlatID, String vopenid, int iRoleID, int iOnlineTime, 
		                    int iLevel, int iVipLvl, int iPay, int iPlayerFriendsNum, 
		                    String vClientVersion, String vSystemHardware, String vTelecomOper, String vNetwork, 
		                    int iForceID)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iOnlineTime = iOnlineTime;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iPlayerFriendsNum = iPlayerFriendsNum;
			this.vClientVersion = vClientVersion;
			this.vSystemHardware = vSystemHardware;
			this.vTelecomOper = vTelecomOper;
			this.vNetwork = vNetwork;
			this.iForceID = iForceID;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerLogout");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iOnlineTime);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iPlayerFriendsNum);
			sb.append('|').append(vClientVersion);
			sb.append('|').append(vSystemHardware);
			sb.append('|').append(vTelecomOper);
			sb.append('|').append(vNetwork);
			sb.append('|').append(iForceID);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)�û�OPENID��
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// (����)���ε�¼����ʱ��(��)
		public int iOnlineTime;
		// (����)�ȼ�
		public int iLevel;
		// (����)��ɫvip�ȼ�
		public int iVipLvl;
		// (����)��ɫ��ֵ����
		public int iPay;
		// (����)��Һ�������
		public int iPlayerFriendsNum;
		// (����)�ͻ��˰汾
		public String vClientVersion;
		// (����)�ƶ��ն˻���
		public String vSystemHardware;
		// (����)��Ӫ��
		public String vTelecomOper;
		// (����)3G/WIFI/2G
		public String vNetwork;
		// (����)��������ID������0
		public int iForceID;
	}

	// (��ѡ)����������ˮ��
	public static class PlayerLevelUpFlow
	{

		public PlayerLevelUpFlow() { }

		public PlayerLevelUpFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                         int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                         int iVipLvl, int iPay, int iTime)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iTime = iTime;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerLevelUpFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iTime);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ��ǰ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)�����ϴ���������ʱ��(��)
		public int iTime;
	}

	// (��ѡ)����ͨ����Ʒ��¼��ˮ��
	public static class PlayerCommonChangeFlow
	{

		public PlayerCommonChangeFlow() { }

		public PlayerCommonChangeFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                              int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                              int iVipLvl, int iPay, int iEventID, int iCommonType, 
		                              int iCommonItemID, int iChangeCount, int iAfterCount, int iArg1, 
		                              int iArg2, int iArg3, int iArg4)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iEventID = iEventID;
			this.iCommonType = iCommonType;
			this.iCommonItemID = iCommonItemID;
			this.iChangeCount = iChangeCount;
			this.iAfterCount = iAfterCount;
			this.iArg1 = iArg1;
			this.iArg2 = iArg2;
			this.iArg3 = iArg3;
			this.iArg4 = iArg4;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerCommonChangeFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iEventID);
			sb.append('|').append(iCommonType);
			sb.append('|').append(iCommonItemID);
			sb.append('|').append(iChangeCount);
			sb.append('|').append(iAfterCount);
			sb.append('|').append(iArg1);
			sb.append('|').append(iArg2);
			sb.append('|').append(iArg3);
			sb.append('|').append(iArg4);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)���ڹ���һ�ζ�������������ͬ���͵ĵ���������־
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��Ϸ�¼�����ʱ�����ҵȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// ����ͨ����Ʒ�仯����Ϸ�¼�ID
		public int iEventID;
		// �漰�ı仯��ͨ����Ʒ����ID
		public int iCommonType;
		// �漰�ı仯��ͨ����ƷID (���ڽ�Ǯ����ʯ�������޾���ID��������0)
		public int iCommonItemID;
		// �漰�ı仯��ͨ����Ʒ����  ����0�������,С��0���ļ���
		public int iChangeCount;
		// �仯���ͨ����Ʒ����
		public int iAfterCount;
		// (��ѡ)��Ϸ�¼���������1,���ݾ���iEvnetID�Ĳ�ͬ�в�ͬ������,�����ս���¼��ڴ˺���Ϊս������
		public int iArg1;
		// (��ѡ)��Ϸ�¼���������2,���ݾ���iEvnetID�Ĳ�ͬ�в�ͬ������,�����ս���¼��ڴ˺���Ϊս�����
		public int iArg2;
		// (��ѡ)��Ϸ�¼���������3,���ݾ���iEvnetID�Ĳ�ͬ�в�ͬ������,�����ս���¼��ڴ˺���Ϊ�ؿ����
		public int iArg3;
		// (��ѡ)��Ϸ�¼���������4,���ݾ���iEvnetID�Ĳ�ͬ�в�ͬ������,�����ս���¼��ڴ˺���Ϊ�Ǽ�
		public int iArg4;
	}

	// (��ѡ)����ͨ����Ʒ��¼��ˮ��
	public static class PlayerCommonChangeFlow2
	{

		public PlayerCommonChangeFlow2() { }

		public PlayerCommonChangeFlow2(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                               int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                               int iVipLvl, int iPay, int iEventID, String iCommonItem, 
		                               int iArg1, int iArg2, int iArg3, int iArg4)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iEventID = iEventID;
			this.iCommonItem = iCommonItem;
			this.iArg1 = iArg1;
			this.iArg2 = iArg2;
			this.iArg3 = iArg3;
			this.iArg4 = iArg4;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerCommonChangeFlow2");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iEventID);
			sb.append('|').append(iCommonItem);
			sb.append('|').append(iArg1);
			sb.append('|').append(iArg2);
			sb.append('|').append(iArg3);
			sb.append('|').append(iArg4);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)���ڹ���һ�ζ�������������ͬ���͵ĵ���������־
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��Ϸ�¼�����ʱ�����ҵȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// ����ͨ����Ʒ�仯����Ϸ�¼�ID
		public int iEventID;
		// �漰�ı仯��ͨ����Ʒ����ID����ƷID (���ڽ�Ǯ����ʯ�������޾���ID��������0)���仯��Ŀ�� �仯���������Զ��ŷָ�����ͬ������Ʒ֮���Էֺŷָ�
		public String iCommonItem;
		// (��ѡ)��Ϸ�¼���������1,���ݾ���iEvnetID�Ĳ�ͬ�в�ͬ������,�����ս���¼��ڴ˺���Ϊս������
		public int iArg1;
		// (��ѡ)��Ϸ�¼���������2,���ݾ���iEvnetID�Ĳ�ͬ�в�ͬ������,�����ս���¼��ڴ˺���Ϊս�����
		public int iArg2;
		// (��ѡ)��Ϸ�¼���������3,���ݾ���iEvnetID�Ĳ�ͬ�в�ͬ������,�����ս���¼��ڴ˺���Ϊ�ؿ����
		public int iArg3;
		// (��ѡ)��Ϸ�¼���������4,���ݾ���iEvnetID�Ĳ�ͬ�в�ͬ������,�����ս���¼��ڴ˺���Ϊ�Ǽ�
		public int iArg4;
	}

	// ս��������ˮ
	public static class PlayerBattleFlow
	{

		public PlayerBattleFlow() { }

		public PlayerBattleFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                        int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                        int iVipLvl, int iPay, int iBattleType, int iBattleID, 
		                        int iCheckPointID, int iRoundStar, int iRoundTime, int iCombatType)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iBattleType = iBattleType;
			this.iBattleID = iBattleID;
			this.iCheckPointID = iCheckPointID;
			this.iRoundStar = iRoundStar;
			this.iRoundTime = iRoundTime;
			this.iCombatType = iCombatType;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerBattleFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iBattleType);
			sb.append('|').append(iBattleID);
			sb.append('|').append(iCheckPointID);
			sb.append('|').append(iRoundStar);
			sb.append('|').append(iRoundTime);
			sb.append('|').append(iCombatType);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)����ս������,��ӦBATTLETYPE,����˵���ο�FAQ�ĵ�
		public int iBattleType;
		// (����)����ս���½����,��1��ʼ
		public int iBattleID;
		// (����)����ս���ؿ����,��1��ʼ
		public int iCheckPointID;
		// (����)�����Ǽ�,����0ʤ��������ʧ��
		public int iRoundStar;
		// (����)�Ծ�ʱ��(��)
		public int iRoundTime;
		// (����)�Ծ�ս������,��ӦCOMBATTYPE
		public int iCombatType;
	}

	// ������������ˮ
	public static class PlayerArenaFlow
	{

		public PlayerArenaFlow() { }

		public PlayerArenaFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                       int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                       int iVipLvl, int iPay, int iRank, int iORank, 
		                       int iResult)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iRank = iRank;
			this.iORank = iORank;
			this.iResult = iResult;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerArenaFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iRank);
			sb.append('|').append(iORank);
			sb.append('|').append(iResult);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)��������սʱ����
		public int iRank;
		// (����)��������������
		public int iORank;
		// (����)����ս���������ӦARENARESULT
		public int iResult;
	}

	// �ճ�����������ˮ
	public static class PlayerDailyTaskFlow
	{

		public PlayerDailyTaskFlow() { }

		public PlayerDailyTaskFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                           int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                           int iVipLvl, int iPay, int iTaskID)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iTaskID = iTaskID;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerDailyTaskFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iTaskID);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ճ�����ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)��ɵ��ճ�����ID
		public int iTaskID;
	}

	// �ճ������콱������ˮ
	public static class PlayerDailyTaskRewardFlow
	{

		public PlayerDailyTaskRewardFlow() { }

		public PlayerDailyTaskRewardFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                                 int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                                 int iVipLvl, int iPay, int iTaskID)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iTaskID = iTaskID;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerDailyTaskRewardFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iTaskID);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)�콱���ճ�����ID
		public int iTaskID;
	}

	// ����������ˮ
	public static class PlayerChestFlow
	{

		public PlayerChestFlow() { }

		public PlayerChestFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                       int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                       int iVipLvl, int iPay, int iChestTpe, int iBuyCount, 
		                       int iBuyPrice, int iPriceUnit)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iChestTpe = iChestTpe;
			this.iBuyCount = iBuyCount;
			this.iBuyPrice = iBuyPrice;
			this.iPriceUnit = iPriceUnit;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerChestFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iChestTpe);
			sb.append('|').append(iBuyCount);
			sb.append('|').append(iBuyPrice);
			sb.append('|').append(iPriceUnit);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// ��������,��ӦCHESTTYPE
		public int iChestTpe;
		// һ�ι������
		public int iBuyCount;
		// һ�ι����ܼ�
		public int iBuyPrice;
		// ����۸�λ,��ӦCHESTPRICEUNITTYPE
		public int iPriceUnit;
	}

	// �̳�������ˮ
	public static class PlayerShopFlow
	{

		public PlayerShopFlow() { }

		public PlayerShopFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                      int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                      int iVipLvl, int iPay, int iShopType, int iBuyGoodsType, 
		                      int iBuyGoodsID, int iBuyCount, int iBuyPrice, int iPriceUnit)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iShopType = iShopType;
			this.iBuyGoodsType = iBuyGoodsType;
			this.iBuyGoodsID = iBuyGoodsID;
			this.iBuyCount = iBuyCount;
			this.iBuyPrice = iBuyPrice;
			this.iPriceUnit = iPriceUnit;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerShopFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iShopType);
			sb.append('|').append(iBuyGoodsType);
			sb.append('|').append(iBuyGoodsID);
			sb.append('|').append(iBuyCount);
			sb.append('|').append(iBuyPrice);
			sb.append('|').append(iPriceUnit);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// �̳�����,1��ͨ�̳�,2�������̳�,3����ն���̵�,4��5����������,6�ǹ����̵�
		public int iShopType;
		// ������Ʒ���� CommonType
		public int iBuyGoodsType;
		// ������ƷID
		public int iBuyGoodsID;
		// һ�ι����������ǰΪ1
		public int iBuyCount;
		// һ�ι����ܼ�
		public int iBuyPrice;
		// ����۸�λ,������ʯ����Ǯ����ӦSHOPPRICEUNITTYPE
		public int iPriceUnit;
	}

	// ��������ͨ����¼��
	public static class NewPlayerGuideRecord
	{

		public NewPlayerGuideRecord() { }

		public NewPlayerGuideRecord(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                            int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                            int iVipLvl, int iPay, int iGuideID)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iGuideID = iGuideID;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("NewPlayerGuideRecord");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iGuideID);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// ͨ�������������ڵ�ID
		public int iGuideID;
	}

	// ����ͨ����¼��
	public static class PlayerTaskRecord
	{

		public PlayerTaskRecord() { }

		public PlayerTaskRecord(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                        int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                        int iVipLvl, int iPay, int iTaskID, int iTaskSeq)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iTaskID = iTaskID;
			this.iTaskSeq = iTaskSeq;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerTaskRecord");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iTaskID);
			sb.append('|').append(iTaskSeq);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// ������ID
		public int iTaskID;
		// �����߽ڵ����
		public int iTaskSeq;
	}

	// ǩ����¼��
	public static class PlayerCheckinRecord
	{

		public PlayerCheckinRecord() { }

		public PlayerCheckinRecord(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                           int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                           int iVipLvl, int iPay, int iCheckinMonthID, int iCheckinDaySeq)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iCheckinMonthID = iCheckinMonthID;
			this.iCheckinDaySeq = iCheckinDaySeq;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerCheckinRecord");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iCheckinMonthID);
			sb.append('|').append(iCheckinDaySeq);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// ǩ���·�ID
		public int iCheckinMonthID;
		// ǩ�������������
		public int iCheckinDaySeq;
	}

	// ���֮ս������ˮ
	public static class PlayerChibiBattleFlow
	{

		public PlayerChibiBattleFlow() { }

		public PlayerChibiBattleFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                             int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                             int iVipLvl, int iPay, int iBattleID, int iDifficultyLvl, 
		                             int iRoundStar, int iRoundTime)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iBattleID = iBattleID;
			this.iDifficultyLvl = iDifficultyLvl;
			this.iRoundStar = iRoundStar;
			this.iRoundTime = iRoundTime;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerChibiBattleFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iBattleID);
			sb.append('|').append(iDifficultyLvl);
			sb.append('|').append(iRoundStar);
			sb.append('|').append(iRoundTime);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)���ֳ��ս�ۻ����
		public int iBattleID;
		// (����)����ս���Ѷ�
		public int iDifficultyLvl;
		// (����)�����Ǽ�,����0ʤ��������ʧ��
		public int iRoundStar;
		// (����)�Ծ�ʱ��(��)
		public int iRoundTime;
	}

	// ������������ˮ
	public static class PlayerBaguazhengBattleFlow
	{

		public PlayerBaguazhengBattleFlow() { }

		public PlayerBaguazhengBattleFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                                  int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                                  int iVipLvl, int iPay, int iBattleID, int iDifficultyLvl, 
		                                  int iRoundStar, int iRoundTime)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iBattleID = iBattleID;
			this.iDifficultyLvl = iDifficultyLvl;
			this.iRoundStar = iRoundStar;
			this.iRoundTime = iRoundTime;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerBaguazhengBattleFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iBattleID);
			sb.append('|').append(iDifficultyLvl);
			sb.append('|').append(iRoundStar);
			sb.append('|').append(iRoundTime);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)���ֳ��ս�ۻ����
		public int iBattleID;
		// (����)����ս���Ѷ�
		public int iDifficultyLvl;
		// (����)�����Ǽ�,����0ʤ��������ʧ��
		public int iRoundStar;
		// (����)�Ծ�ʱ��(��)
		public int iRoundTime;
	}

	// װ���ƽ�������ˮ
	public static class PlayerEquipGildFlow
	{

		public PlayerEquipGildFlow() { }

		public PlayerEquipGildFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                           int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                           int iVipLvl, int iPay, int iGeneralID, int iEquipID, 
		                           int iPosID, int iEquipLvl)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iGeneralID = iGeneralID;
			this.iEquipID = iEquipID;
			this.iPosID = iPosID;
			this.iEquipLvl = iEquipLvl;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerEquipGildFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iGeneralID);
			sb.append('|').append(iEquipID);
			sb.append('|').append(iPosID);
			sb.append('|').append(iEquipLvl);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)�ƽ�װ�����佫ID
		public int iGeneralID;
		// (����)�ƽ�װ����ID
		public int iEquipID;
		// (����)װ��λ��ID
		public int iPosID;
		// (����)װ���ƽ��ȼ�
		public int iEquipLvl;
	}

	// ����ն��������ˮ
	public static class PlayerMarchFlow
	{

		public PlayerMarchFlow() { }

		public PlayerMarchFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                       int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                       int iVipLvl, int iPay, int iStageID, int iWin, 
		                       int iRoundTime)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iStageID = iStageID;
			this.iWin = iWin;
			this.iRoundTime = iRoundTime;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerMarchFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iStageID);
			sb.append('|').append(iWin);
			sb.append('|').append(iRoundTime);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)����ID
		public int iStageID;
		// (����)ս����Ӯ��1Ӯ��0��
		public int iWin;
		// (����)ս��ʱ��(��)
		public int iRoundTime;
	}

	// ����ն��������ˮ
	public static class PlayerMarchRewardFlow
	{

		public PlayerMarchRewardFlow() { }

		public PlayerMarchRewardFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                             int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                             int iVipLvl, int iPay, int iStageID, int iPoints)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iStageID = iStageID;
			this.iPoints = iPoints;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerMarchRewardFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iStageID);
			sb.append('|').append(iPoints);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// (����)����ID
		public int iStageID;
		// (����)��������
		public int iPoints;
	}

	// ��ս�佫��Ϣ״̬��
	public static class PlayerBattleGeneralsState
	{

		public PlayerBattleGeneralsState() { }

		public PlayerBattleGeneralsState(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                                 int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                                 int iVipLvl, int iPay, int iBattlePower, int igeneral1ID, 
		                                 int igeneral1Lvl, int igeneral1Star, int igeneral1Adv, int igeneral2ID, 
		                                 int igeneral2Lvl, int igeneral2Star, int igeneral2Adv, int igeneral3ID, 
		                                 int igeneral3Lvl, int igeneral3Star, int igeneral3Adv, int igeneral4ID, 
		                                 int igeneral4Lvl, int igeneral4Star, int igeneral4Adv, int igeneral5ID, 
		                                 int igeneral5Lvl, int igeneral5Star, int igeneral5Adv, int ipetID, 
		                                 int ipetLvl, int ipetStar, int iBattleType)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iBattlePower = iBattlePower;
			this.igeneral1ID = igeneral1ID;
			this.igeneral1Lvl = igeneral1Lvl;
			this.igeneral1Star = igeneral1Star;
			this.igeneral1Adv = igeneral1Adv;
			this.igeneral2ID = igeneral2ID;
			this.igeneral2Lvl = igeneral2Lvl;
			this.igeneral2Star = igeneral2Star;
			this.igeneral2Adv = igeneral2Adv;
			this.igeneral3ID = igeneral3ID;
			this.igeneral3Lvl = igeneral3Lvl;
			this.igeneral3Star = igeneral3Star;
			this.igeneral3Adv = igeneral3Adv;
			this.igeneral4ID = igeneral4ID;
			this.igeneral4Lvl = igeneral4Lvl;
			this.igeneral4Star = igeneral4Star;
			this.igeneral4Adv = igeneral4Adv;
			this.igeneral5ID = igeneral5ID;
			this.igeneral5Lvl = igeneral5Lvl;
			this.igeneral5Star = igeneral5Star;
			this.igeneral5Adv = igeneral5Adv;
			this.ipetID = ipetID;
			this.ipetLvl = ipetLvl;
			this.ipetStar = ipetStar;
			this.iBattleType = iBattleType;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerBattleGeneralsState");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iBattlePower);
			sb.append('|').append(igeneral1ID);
			sb.append('|').append(igeneral1Lvl);
			sb.append('|').append(igeneral1Star);
			sb.append('|').append(igeneral1Adv);
			sb.append('|').append(igeneral2ID);
			sb.append('|').append(igeneral2Lvl);
			sb.append('|').append(igeneral2Star);
			sb.append('|').append(igeneral2Adv);
			sb.append('|').append(igeneral3ID);
			sb.append('|').append(igeneral3Lvl);
			sb.append('|').append(igeneral3Star);
			sb.append('|').append(igeneral3Adv);
			sb.append('|').append(igeneral4ID);
			sb.append('|').append(igeneral4Lvl);
			sb.append('|').append(igeneral4Star);
			sb.append('|').append(igeneral4Adv);
			sb.append('|').append(igeneral5ID);
			sb.append('|').append(igeneral5Lvl);
			sb.append('|').append(igeneral5Star);
			sb.append('|').append(igeneral5Adv);
			sb.append('|').append(ipetID);
			sb.append('|').append(ipetLvl);
			sb.append('|').append(ipetStar);
			sb.append('|').append(iBattleType);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// ��սս��ս��
		public int iBattlePower;
		// ��ս�佫1ID,����0
		public int igeneral1ID;
		// ��ս�佫1�ȼ�,����0
		public int igeneral1Lvl;
		// ��ս�佫1�Ǽ�,����0,�Ǽ�1-5��Ӧ1�ǵ�5��
		public int igeneral1Star;
		// ��ս�佫1�����ȼ�,����0
		public int igeneral1Adv;
		// ��ս�佫2ID,����0
		public int igeneral2ID;
		// ��ս�佫2�ȼ�,����0
		public int igeneral2Lvl;
		// ��ս�佫2�Ǽ�,����0
		public int igeneral2Star;
		// ��ս�佫2�����ȼ�,����0
		public int igeneral2Adv;
		// ��ս�佫3ID,����0
		public int igeneral3ID;
		// ��ս�佫3�ȼ�,����0
		public int igeneral3Lvl;
		// ��ս�佫3�Ǽ�,����0
		public int igeneral3Star;
		// ��ս�佫3�����ȼ�,����0
		public int igeneral3Adv;
		// ��ս�佫4ID,����0
		public int igeneral4ID;
		// ��ս�佫4�ȼ�,����0
		public int igeneral4Lvl;
		// ��ս�佫4�Ǽ�,����0
		public int igeneral4Star;
		// ��ս�佫4�����ȼ�,����0
		public int igeneral4Adv;
		// ��ս�佫5ID,����0
		public int igeneral5ID;
		// ��ս�佫5�ȼ�,����0
		public int igeneral5Lvl;
		// ��ս�佫5�Ǽ�,����0
		public int igeneral5Star;
		// ��ս�佫5�����ȼ�,����0
		public int igeneral5Adv;
		// ��ս����ID,����0
		public int ipetID;
		// ��ս����ȼ�,����0
		public int ipetLvl;
		// ��ս�����Ǽ�,����0
		public int ipetStar;
		// ս������  GENERALEBATTLETYPE
		public int iBattleType;
	}

	// �佫������ˮ��
	public static class GeneralEvolutionFlow
	{

		public GeneralEvolutionFlow() { }

		public GeneralEvolutionFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                            int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                            int iVipLvl, int iPay, int igeneralID, int igeneralLvl, 
		                            int igeneralStar, int igeneralAdv, int iEvolutionType, int igeneralLvlBefore, 
		                            int igeneralStarBefore, int igeneralAdvBefore)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.igeneralID = igeneralID;
			this.igeneralLvl = igeneralLvl;
			this.igeneralStar = igeneralStar;
			this.igeneralAdv = igeneralAdv;
			this.iEvolutionType = iEvolutionType;
			this.igeneralLvlBefore = igeneralLvlBefore;
			this.igeneralStarBefore = igeneralStarBefore;
			this.igeneralAdvBefore = igeneralAdvBefore;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("GeneralEvolutionFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(igeneralID);
			sb.append('|').append(igeneralLvl);
			sb.append('|').append(igeneralStar);
			sb.append('|').append(igeneralAdv);
			sb.append('|').append(iEvolutionType);
			sb.append('|').append(igeneralLvlBefore);
			sb.append('|').append(igeneralStarBefore);
			sb.append('|').append(igeneralAdvBefore);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// �����佫��ID
		public int igeneralID;
		// �����佫�ȼ�
		public int igeneralLvl;
		// �����佫�Ǽ�
		public int igeneralStar;
		// �����佫���׵ȼ�
		public int igeneralAdv;
		// �����佫��������
		public int iEvolutionType;
		// �����佫����ǰ�ȼ�
		public int igeneralLvlBefore;
		// �����佫����ǰ�Ǽ�
		public int igeneralStarBefore;
		// �����佫����ǰ���׵ȼ�
		public int igeneralAdvBefore;
	}

	// ���һ������ˮ��
	public static class PlayerForceEventFlow
	{

		public PlayerForceEventFlow() { }

		public PlayerForceEventFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                            int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                            int iVipLvl, int iPay, int iForceID, int iForceEvent, 
		                            int iEventArg1, int iEventArg2)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iForceID = iForceID;
			this.iForceEvent = iForceEvent;
			this.iEventArg1 = iEventArg1;
			this.iEventArg2 = iEventArg2;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerForceEventFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iForceID);
			sb.append('|').append(iForceEvent);
			sb.append('|').append(iEventArg1);
			sb.append('|').append(iEventArg2);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// ����ID
		public int iForceID;
		// ���һ�¼� FORCEEVENTTYPE
		public int iForceEvent;
		// �����¼�����1
		public int iEventArg1;
		// �����¼�����2
		public int iEventArg2;
	}

	// ����״̬��
	public static class ForceState
	{

		public ForceState() { }

		public ForceState(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                  int iPlatID, int iForceID, String sForceName, int iForceLvl, 
		                  int iForceMemberCnt, int iForceVitality, int iForceVitalityMemCnt)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.iForceID = iForceID;
			this.sForceName = sForceName;
			this.iForceLvl = iForceLvl;
			this.iForceMemberCnt = iForceMemberCnt;
			this.iForceVitality = iForceVitality;
			this.iForceVitalityMemCnt = iForceVitalityMemCnt;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("ForceState");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(iForceID);
			sb.append('|').append(sForceName);
			sb.append('|').append(iForceLvl);
			sb.append('|').append(iForceMemberCnt);
			sb.append('|').append(iForceVitality);
			sb.append('|').append(iForceVitalityMemCnt);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// ����ID
		public int iForceID;
		// ��������
		public String sForceName;
		// ���ҵȼ�
		public int iForceLvl;
		// ���ҳ�Ա����
		public int iForceMemberCnt;
		// ���һ�Ծ��
		public int iForceVitality;
		// ���һ�Ծ�Ȳ�������
		public int iForceVitalityMemCnt;
	}

	// ��ҳ�ֵ��ˮ��
	public static class PlayerPayFlow
	{

		public PlayerPayFlow() { }

		public PlayerPayFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                     int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                     int iVipLvl, int iPay, int iVipLvlBefore, int iPayBefore, 
		                     int iPayLvlID, int iPayAmount, int iDiamondCnt)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iVipLvlBefore = iVipLvlBefore;
			this.iPayBefore = iPayBefore;
			this.iPayLvlID = iPayLvlID;
			this.iPayAmount = iPayAmount;
			this.iDiamondCnt = iDiamondCnt;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PlayerPayFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iVipLvlBefore);
			sb.append('|').append(iPayBefore);
			sb.append('|').append(iPayLvlID);
			sb.append('|').append(iPayAmount);
			sb.append('|').append(iDiamondCnt);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ�ܽ��(��λ��ʯ��)
		public int iPay;
		// ��ֵǰ��ɫvip�ȼ�
		public int iVipLvlBefore;
		// ��ֵǰ��ɫ��ֵ�ܽ��(��λ��ʯ��)
		public int iPayBefore;
		// ��ֵ��λ PAYLEVELTYPE
		public int iPayLvlID;
		// ��ֵ���(��λRMB)
		public int iPayAmount;
		// ��ȡ����ʯ��
		public int iDiamondCnt;
	}

	// (����)SNS��ˮ
	public static class SnsFlow
	{

		public SnsFlow() { }

		public SnsFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		               int iPlatID, int iAreaID, String vopenid, int iRoleID, 
		               int iLevel, int iVipLvl, int iPay, int iRecNum, 
		               int iCount, int iSNSType, int iSNSSubType)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.iAreaID = iAreaID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iRecNum = iRecNum;
			this.iCount = iCount;
			this.iSNSType = iSNSType;
			this.iSNSSubType = iSNSSubType;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("SnsFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(iAreaID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iRecNum);
			sb.append('|').append(iCount);
			sb.append('|').append(iSNSType);
			sb.append('|').append(iSNSSubType);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)weixn 1/qq 2
		public int iAreaID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ�ܽ��(��λ��ʯ��)
		public int iPay;
		// (��ѡ)������Ҹ���
		public int iRecNum;
		// (����)���͵�����
		public int iCount;
		// (����)����һ������,����˵���ο�FAQ�ĵ�
		public int iSNSType;
		// (��ѡ)������������
		public int iSNSSubType;
	}

	// ������ˮ��
	public static class PetPoundFlow
	{

		public PetPoundFlow() { }

		public PetPoundFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                    int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                    int iVipLvl, int iPay, int iEventType, int iEventArg)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iEventType = iEventType;
			this.iEventArg = iEventArg;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("PetPoundFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iEventType);
			sb.append('|').append(iEventArg);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// �����¼�����  PETPOUNDEVENTTYPE
		public int iEventType;
		// �����¼�����
		public int iEventArg;
	}

	// �����ӵ���ˮ��
	public static class CityWarFlow
	{

		public CityWarFlow() { }

		public CityWarFlow(String vGameSvrId, String dtEventTime, int iSequence, String vGameAppid, 
		                   int iPlatID, String vopenid, int iRoleID, int iLevel, 
		                   int iVipLvl, int iPay, int iEventType, int iEventArg1, 
		                   int iEventArg2, int iEventArg3, int iEventArg4)
		{
			this.vGameSvrId = vGameSvrId;
			this.dtEventTime = dtEventTime;
			this.iSequence = iSequence;
			this.vGameAppid = vGameAppid;
			this.iPlatID = iPlatID;
			this.vopenid = vopenid;
			this.iRoleID = iRoleID;
			this.iLevel = iLevel;
			this.iVipLvl = iVipLvl;
			this.iPay = iPay;
			this.iEventType = iEventType;
			this.iEventArg1 = iEventArg1;
			this.iEventArg2 = iEventArg2;
			this.iEventArg3 = iEventArg3;
			this.iEventArg4 = iEventArg4;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("CityWarFlow");
			sb.append('|').append(vGameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(iSequence);
			sb.append('|').append(vGameAppid);
			sb.append('|').append(iPlatID);
			sb.append('|').append(vopenid);
			sb.append('|').append(iRoleID);
			sb.append('|').append(iLevel);
			sb.append('|').append(iVipLvl);
			sb.append('|').append(iPay);
			sb.append('|').append(iEventType);
			sb.append('|').append(iEventArg1);
			sb.append('|').append(iEventArg2);
			sb.append('|').append(iEventArg3);
			sb.append('|').append(iEventArg4);
			sb.append('\n');
			return sb.toString();
		}

		// (����)��¼����Ϸ���������
		public String vGameSvrId;
		// (����)��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (��ѡ)ͬһ����������һ��ʱ����Ψһ���¼����
		public int iSequence;
		// (����)��ϷAPPID
		public String vGameAppid;
		// (����)ios 0/android 1
		public int iPlatID;
		// (����)���
		public String vopenid;
		// �ڲ���ɫID
		public int iRoleID;
		// ��ɫ����ս��ʱ�ȼ�
		public int iLevel;
		// ��ɫvip�ȼ�
		public int iVipLvl;
		// ��ɫ��ֵ����
		public int iPay;
		// �����ӵ��¼�����  CITYWAREVENTTYPE
		public int iEventType;
		// �����ӵ��¼�����1
		public int iEventArg1;
		// �����ӵ��¼�����2
		public int iEventArg2;
		// �����ӵ��¼�����3
		public int iEventArg3;
		// �����ӵ��¼�����4
		public int iEventArg4;
	}

	// (����)������״̬��ˮ��ÿ����һ����־
	public static class GameSvrState
	{

		public GameSvrState() { }

		public GameSvrState(String dtEventTime, String vGameIP)
		{
			this.dtEventTime = dtEventTime;
			this.vGameIP = vGameIP;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("GameSvrState");
			sb.append('|').append(dtEventTime);
			sb.append('|').append(vGameIP);
			sb.append('\n');
			return sb.toString();
		}

		// (����) ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// (����)������IP
		public String vGameIP;
	}

	// ������Ϸ��ʼ��ˮ��
	public static class SecRoundStartFlow
	{

		public SecRoundStartFlow() { }

		public SecRoundStartFlow(String GameSvrId, String dtEventTime, String GameAppID, String OpenID, 
		                         int PlatID, int AreaID, int BattleID, String ClientStartTime, 
		                         String UserName, int SvrUserMoney1, int SvrUserMoney2, int SvrUserPoint, 
		                         int SvrMapid, int SvrRoundType, int SvrRoundDiffculty1, int SvrRoundChiBiType, 
		                         int SvrRoundBaGuaType, int SvrRoundDiffculty2, int SvrRoundlevelNeed, int SvrRoundFloorId, 
		                         int SvrCostPoint, int SvrroundBattlePoint, int SvrUserBattlePoint, int SvrRoundScene, 
		                         int SvrEnemyCount, int SvrBossCount, int SvrEmenyImmune)
		{
			this.GameSvrId = GameSvrId;
			this.dtEventTime = dtEventTime;
			this.GameAppID = GameAppID;
			this.OpenID = OpenID;
			this.PlatID = PlatID;
			this.AreaID = AreaID;
			this.BattleID = BattleID;
			this.ClientStartTime = ClientStartTime;
			this.UserName = UserName;
			this.SvrUserMoney1 = SvrUserMoney1;
			this.SvrUserMoney2 = SvrUserMoney2;
			this.SvrUserPoint = SvrUserPoint;
			this.SvrMapid = SvrMapid;
			this.SvrRoundType = SvrRoundType;
			this.SvrRoundDiffculty1 = SvrRoundDiffculty1;
			this.SvrRoundChiBiType = SvrRoundChiBiType;
			this.SvrRoundBaGuaType = SvrRoundBaGuaType;
			this.SvrRoundDiffculty2 = SvrRoundDiffculty2;
			this.SvrRoundlevelNeed = SvrRoundlevelNeed;
			this.SvrRoundFloorId = SvrRoundFloorId;
			this.SvrCostPoint = SvrCostPoint;
			this.SvrroundBattlePoint = SvrroundBattlePoint;
			this.SvrUserBattlePoint = SvrUserBattlePoint;
			this.SvrRoundScene = SvrRoundScene;
			this.SvrEnemyCount = SvrEnemyCount;
			this.SvrBossCount = SvrBossCount;
			this.SvrEmenyImmune = SvrEmenyImmune;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("SecRoundStartFlow");
			sb.append('|').append(GameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(GameAppID);
			sb.append('|').append(OpenID);
			sb.append('|').append(PlatID);
			sb.append('|').append(AreaID);
			sb.append('|').append(BattleID);
			sb.append('|').append(ClientStartTime);
			sb.append('|').append(UserName);
			sb.append('|').append(SvrUserMoney1);
			sb.append('|').append(SvrUserMoney2);
			sb.append('|').append(SvrUserPoint);
			sb.append('|').append(SvrMapid);
			sb.append('|').append(SvrRoundType);
			sb.append('|').append(SvrRoundDiffculty1);
			sb.append('|').append(SvrRoundChiBiType);
			sb.append('|').append(SvrRoundBaGuaType);
			sb.append('|').append(SvrRoundDiffculty2);
			sb.append('|').append(SvrRoundlevelNeed);
			sb.append('|').append(SvrRoundFloorId);
			sb.append('|').append(SvrCostPoint);
			sb.append('|').append(SvrroundBattlePoint);
			sb.append('|').append(SvrUserBattlePoint);
			sb.append('|').append(SvrRoundScene);
			sb.append('|').append(SvrEnemyCount);
			sb.append('|').append(SvrBossCount);
			sb.append('|').append(SvrEmenyImmune);
			sb.append('\n');
			return sb.toString();
		}

		// ��¼����Ϸ����˱��
		public String GameSvrId;
		// ��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// ��ϷAPPID
		public String GameAppID;
		// �û�OPENID��
		public String OpenID;
		// ios 0 /android 1
		public int PlatID;
		// ΢�� 0 /��Q 1
		public int AreaID;
		// ����ID������ɹ���־��iBattleID������
		public int BattleID;
		// �ͻ��˱���ʱ�䣬��ʽ YYYY-MM-DD HH:MM:SS
		public String ClientStartTime;
		// ����ǳƣ�ֻ���������ַ���Ӣ�ĺ����֡�����ǳ��д��������ַ������¼ʱȥ�������� ��|�� ��Ϊ ����
		public String UserName;
		// ��Ϸ������
		public int SvrUserMoney1;
		// ��ʯ����
		public int SvrUserMoney2;
		// ��ǰ��Ұ��ӣ��������������㱾�����ģ�
		public int SvrUserPoint;
		// ���ֹؿ����
		public int SvrMapid;
		// ������Ϸ����,1Ϊս�ۣ�2Ϊ���֮ս��3Ϊ������4Ϊ����ն��
		public int SvrRoundType;
		// ��ͨ�������Ѷ�,1Ϊ��ͨ��2Ϊ��Ӣ��������Ϸ���ͼ�0��
		public int SvrRoundDiffculty1;
		// ���֮ս���ͣ�1Ϊ�ݴ������2Ϊ���ճ�ڣ�������Ϸ���ͼ�0��
		public int SvrRoundChiBiType;
		// ����ս���ͣ�1Ϊ���ţ�2Ϊ���ţ�������Ϸ���ͼ�0��
		public int SvrRoundBaGuaType;
		// ս�۸������Ѷ�,1Ϊ��ͨ��2Ϊ��Ӣ��������Ϸ���ͼ�0��
		public int SvrRoundDiffculty2;
		// �ؿ�����ĵȼ�
		public int SvrRoundlevelNeed;
		// ����ն���ĵ�ǰ������������Ϸ���ͼ�0��
		public int SvrRoundFloorId;
		// ������������ֵ
		public int SvrCostPoint;
		// �ؿ��Ƽ�ս����
		public int SvrroundBattlePoint;
		// ���ս����
		public int SvrUserBattlePoint;
		// ���ֹ����ܲ���
		public int SvrRoundScene;
		// �з�����������С�ֺ�boss������
		public int SvrEnemyCount;
		// �з�Boss����
		public int SvrBossCount;
		// �ؿ��ڴ��ڵ��˺����ߣ�0Ϊ�����ߣ�1Ϊ�������ߣ�2Ϊħ������
		public int SvrEmenyImmune;
	}

	// ������Ϸ������ˮ��
	public static class SecRoundEndFlow
	{

		public SecRoundEndFlow() { }

		public SecRoundEndFlow(String GameSvrId, String dtEventTime, String GameAppID, String OpenID, 
		                       int PlatID, int AreaID, int BattleID, String ClientEndTime, 
		                       String ClientVersion, String UserIP, int Result, int RoundEndType, 
		                       int RoundStarCount, int RoundExp, int RoundGold, int RoundScene, 
		                       int DPSTotal, String DropItemType1, String DropItemType2, String DropItemType3, 
		                       int SvrTimeCount, int ClientTimeCount, int RoundSpeed, int EnemyCount, 
		                       int EnemyKillCount, int SecPauseTimeTotal)
		{
			this.GameSvrId = GameSvrId;
			this.dtEventTime = dtEventTime;
			this.GameAppID = GameAppID;
			this.OpenID = OpenID;
			this.PlatID = PlatID;
			this.AreaID = AreaID;
			this.BattleID = BattleID;
			this.ClientEndTime = ClientEndTime;
			this.ClientVersion = ClientVersion;
			this.UserIP = UserIP;
			this.Result = Result;
			this.RoundEndType = RoundEndType;
			this.RoundStarCount = RoundStarCount;
			this.RoundExp = RoundExp;
			this.RoundGold = RoundGold;
			this.RoundScene = RoundScene;
			this.DPSTotal = DPSTotal;
			this.DropItemType1 = DropItemType1;
			this.DropItemType2 = DropItemType2;
			this.DropItemType3 = DropItemType3;
			this.SvrTimeCount = SvrTimeCount;
			this.ClientTimeCount = ClientTimeCount;
			this.RoundSpeed = RoundSpeed;
			this.EnemyCount = EnemyCount;
			this.EnemyKillCount = EnemyKillCount;
			this.SecPauseTimeTotal = SecPauseTimeTotal;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("SecRoundEndFlow");
			sb.append('|').append(GameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(GameAppID);
			sb.append('|').append(OpenID);
			sb.append('|').append(PlatID);
			sb.append('|').append(AreaID);
			sb.append('|').append(BattleID);
			sb.append('|').append(ClientEndTime);
			sb.append('|').append(ClientVersion);
			sb.append('|').append(UserIP);
			sb.append('|').append(Result);
			sb.append('|').append(RoundEndType);
			sb.append('|').append(RoundStarCount);
			sb.append('|').append(RoundExp);
			sb.append('|').append(RoundGold);
			sb.append('|').append(RoundScene);
			sb.append('|').append(DPSTotal);
			sb.append('|').append(DropItemType1);
			sb.append('|').append(DropItemType2);
			sb.append('|').append(DropItemType3);
			sb.append('|').append(SvrTimeCount);
			sb.append('|').append(ClientTimeCount);
			sb.append('|').append(RoundSpeed);
			sb.append('|').append(EnemyCount);
			sb.append('|').append(EnemyKillCount);
			sb.append('|').append(SecPauseTimeTotal);
			sb.append('\n');
			return sb.toString();
		}

		// ��¼����Ϸ����˱��
		public String GameSvrId;
		// ��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// ��ϷAPPID
		public String GameAppID;
		// �û�OPENID��
		public String OpenID;
		// ios 0 /android 1
		public int PlatID;
		// ΢�� 0 /��Q 1
		public int AreaID;
		// ����ID,���ڿ�ʼ��־��BattleID,���ڹ�����־
		public int BattleID;
		// �ͻ��˱���ʱ��,��ʽ YYYY-MM-DD HH:MM:SS
		public String ClientEndTime;
		// �ͻ��˰汾��
		public String ClientVersion;
		// ���ip��ַ
		public String UserIP;
		// ������ж��������,0Ϊͨ��,����Ϊ����
		public int Result;
		// ���ֽ�����ʽ��0Ϊս��ʤ����1Ϊս��ʧ��
		public int RoundEndType;
		// ������������
		public int RoundStarCount;
		// ���ֻ�þ��飨����BUFF�ӳɺ�
		public int RoundExp;
		// ���ֻ����Ϸ��
		public int RoundGold;
		// ����ͨ���Ĺ��ﲨ��
		public int RoundScene;
		// ������ɵ����˺����ų������˺���
		public int DPSTotal;
		// ���ֵ��俨��id�б� |id1,id2,id3,id4...|
		public String DropItemType1;
		// ���ֵ������id�б�������Ƭ�� |id1,id2,id3,id4...|
		public String DropItemType2;
		// ���ֵ���װ��id�б� |id1,id2,id3,id4...|
		public String DropItemType3;
		// ������ͳ�Ƶ��ֿ�ʼ������ʱ�����ģ�������Ϸ�е���ͣʱ�䣩
		public int SvrTimeCount;
		// �ͻ���ͳ�Ƶ��ֿ�ʼ������ʱ�����ģ�������Ϸ�е���ͣʱ�䣩
		public int ClientTimeCount;
		// �ͻ���ͳ�Ƶ�ʵ�ʼ��ٱ���
		public int RoundSpeed;
		// �ͻ���ͳ��ս�����ֵĹ���������������С����boss������
		public int EnemyCount;
		// �ͻ���ͳ��ս�������Ĺ���������������С����boss������
		public int EnemyKillCount;
		// ��ͣ�ۼ�ʱ�䣬��λ������
		public int SecPauseTimeTotal;
	}

	// ������Ϣ������־
	public static class SecTalkFlow
	{

		public SecTalkFlow() { }

		public SecTalkFlow(String GameSvrId, String dtEventTime, String GameAppID, String OpenID, 
		                   int PlatID, int AreaID, int RoleLevel, String UserIP, 
		                   String ReceiverOpenID, int ReceiverRoleLevel, int ChatType, String TitleContents, 
		                   String ChatContents)
		{
			this.GameSvrId = GameSvrId;
			this.dtEventTime = dtEventTime;
			this.GameAppID = GameAppID;
			this.OpenID = OpenID;
			this.PlatID = PlatID;
			this.AreaID = AreaID;
			this.RoleLevel = RoleLevel;
			this.UserIP = UserIP;
			this.ReceiverOpenID = ReceiverOpenID;
			this.ReceiverRoleLevel = ReceiverRoleLevel;
			this.ChatType = ChatType;
			this.TitleContents = TitleContents;
			this.ChatContents = ChatContents;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("SecTalkFlow");
			sb.append('|').append(GameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(GameAppID);
			sb.append('|').append(OpenID);
			sb.append('|').append(PlatID);
			sb.append('|').append(AreaID);
			sb.append('|').append(RoleLevel);
			sb.append('|').append(UserIP);
			sb.append('|').append(ReceiverOpenID);
			sb.append('|').append(ReceiverRoleLevel);
			sb.append('|').append(ChatType);
			sb.append('|').append(TitleContents);
			sb.append('|').append(ChatContents);
			sb.append('\n');
			return sb.toString();
		}

		// ��¼����Ϸ����˱��
		public String GameSvrId;
		// ��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// ��ϷAPPID
		public String GameAppID;
		// ���ͷ��û�OPENID��
		public String OpenID;
		// ios 0 /android 1
		public int PlatID;
		// ΢�� 0 /��Q 1
		public int AreaID;
		// ���ͷ���ɫ�ȼ�
		public int RoleLevel;
		// ������Ϣ���ip��ַ
		public String UserIP;
		// ���շ���ɫOPENID��
		public String ReceiverOpenID;
		// ���շ���ɫ�ȼ�
		public int ReceiverRoleLevel;
		// ��Ϣ���ͣ�0 Ϊ�ʼ���˽�ģ���1 ΪС���ȣ�10 Ϊ�޸�ǩ����11 Ϊ���ṫ��
		public int ChatType;
		// �ʼ��������ݣ�Ŀǰ����ܷ��͵���50�ֽڵ���Ϣ����
		public String TitleContents;
		// ��Ϣ���ݣ�Ŀǰ����ܷ��͵���512�ֽڵ���Ϣ����
		public String ChatContents;
	}

	// idip������ˮ
	public static class IDIPCmdFlow
	{

		public IDIPCmdFlow() { }

		public IDIPCmdFlow(String GameSvrId, String dtEventTime, String GameAppID, String Openid, 
		                   int PlatID, int iArea, int item_type, int item_id, 
		                   int item_num, String serialnum, int source_id, String Cmd)
		{
			this.GameSvrId = GameSvrId;
			this.dtEventTime = dtEventTime;
			this.GameAppID = GameAppID;
			this.Openid = Openid;
			this.PlatID = PlatID;
			this.iArea = iArea;
			this.item_type = item_type;
			this.item_id = item_id;
			this.item_num = item_num;
			this.serialnum = serialnum;
			this.source_id = source_id;
			this.Cmd = Cmd;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder("");
			sb.append("IDIPCmdFlow");
			sb.append('|').append(GameSvrId);
			sb.append('|').append(dtEventTime);
			sb.append('|').append(GameAppID);
			sb.append('|').append(Openid);
			sb.append('|').append(PlatID);
			sb.append('|').append(iArea);
			sb.append('|').append(item_type);
			sb.append('|').append(item_id);
			sb.append('|').append(item_num);
			sb.append('|').append(serialnum);
			sb.append('|').append(source_id);
			sb.append('|').append(Cmd);
			sb.append('\n');
			return sb.toString();
		}

		// ��¼����Ϸ����˱��
		public String GameSvrId;
		// ��Ϸ�¼���ʱ��, ��ʽ YYYY-MM-DD HH:MM:SS
		public String dtEventTime;
		// ��ϷAPPID
		public String GameAppID;
		// ���ͷ��û�OPENID��
		public String Openid;
		// ios 0 /android 1
		public int PlatID;
		// ������
		public int iArea;
		// ��������
		public int item_type;
		// ����id
		public int item_id;
		// ��������
		public int item_num;
		// ��ˮ��
		public String serialnum;
		// ������
		public int source_id;
		// ������
		public String Cmd;
	}

}
