// modified by ket.kio.RPCGen at Mon Dec 01 17:32:08 CST 2014.

package i3k.gs.test;

import ket.kio.PacketDecoder;
import ket.kio.PacketEncoder;
import ket.kio.TCPClient;
import ket.kio.SimplePacket;

import i3k.rpc.ABaseDencoder;
import i3k.rpc.Packet;

public class TCPGameClient extends TCPClient<SimplePacket>
{

	public TCPGameClient(RPCManagerClient managerRPC)
	{
		super(managerRPC.getNetManager());
		this.managerRPC = managerRPC;
	}

	private class Dencoder extends ABaseDencoder
	{
		@Override
		public boolean doCheckPacketType(int ptype)
		{
			switch( ptype )
			{
			// server to client
			case Packet.eS2CPKTServerChallenge:
			case Packet.eS2CPKTServerResponse:
			case Packet.eS2CPKTLuaChannel:
			case Packet.eS2CPKTLuaChannel2:
			case Packet.eS2CPKTCmnRPCResponse:
			case Packet.eS2CPKTAntiData:
				return true;
			default:
				break;
			}
			return false;
		}
	}

	@Override
	public PacketEncoder<SimplePacket> getEncoder()
	{
		return dencoder;
	}

	@Override
	public PacketDecoder<SimplePacket> getDecoder()
	{
		return dencoder;
	}

	@Override
	public void onOpen()
	{
		managerRPC.onTCPGameClientOpen(this);
	}

	@Override
	public void onOpenFailed(ket.kio.ErrorCode errcode)
	{
		managerRPC.onTCPGameClientOpenFailed(this, errcode);
	}

	@Override
	public void onClose(ket.kio.ErrorCode errcode)
	{
		managerRPC.onTCPGameClientClose(this, errcode);
	}

	@Override
	public void onPacketRecv(SimplePacket packet)
	{
		switch( packet.getType() )
		{
		// server to client
		case Packet.eS2CPKTServerChallenge:
			{
				Packet.S2C.ServerChallenge p = (Packet.S2C.ServerChallenge)packet;
				managerRPC.onTCPGameClientRecvServerChallenge(this, p);
			}
			break;
		case Packet.eS2CPKTServerResponse:
			{
				Packet.S2C.ServerResponse p = (Packet.S2C.ServerResponse)packet;
				managerRPC.onTCPGameClientRecvServerResponse(this, p);
			}
			break;
		case Packet.eS2CPKTLuaChannel:
			{
				Packet.S2C.LuaChannel p = (Packet.S2C.LuaChannel)packet;
				managerRPC.onTCPGameClientRecvLuaChannel(this, p);
			}
			break;
		case Packet.eS2CPKTLuaChannel2:
			{
				Packet.S2C.LuaChannel2 p = (Packet.S2C.LuaChannel2)packet;
				managerRPC.onTCPGameClientRecvLuaChannel2(this, p);
			}
			break;
		case Packet.eS2CPKTCmnRPCResponse:
			{
				Packet.S2C.CmnRPCResponse p = (Packet.S2C.CmnRPCResponse)packet;
				managerRPC.onTCPGameClientRecvCmnRPCResponse(this, p);
			}
			break;
		case Packet.eS2CPKTAntiData:
			{
				Packet.S2C.AntiData p = (Packet.S2C.AntiData)packet;
				managerRPC.onTCPGameClientRecvAntiData(this, p);
			}
			break;
		default:
			break;
		}
	}

	//todo
	private Dencoder dencoder = new Dencoder();
	private RPCManagerClient managerRPC;
}
