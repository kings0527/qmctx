// modified by ket.kio.RPCGen at Mon Jan 04 14:34:52 CST 2016.

#ifndef __I3K__TCPFRIENDCLIENT_H
#define __I3K__TCPFRIENDCLIENT_H

#include <ket/kio/packet.h>
#include <ket/kio/netmanager.h>

#include "abasedencoder.h"

namespace I3K
{

	class RPCManager;
	class TCPFriendClient : public KET::KIO::TCPClient<KET::KIO::SimplePacket>, public ABaseDencoder
	{
	public:
		TCPFriendClient(KET::KIO::NetManager &managerNet);
		virtual ~TCPFriendClient() { }

	public:
		void SetRPCManager(RPCManager *pRPCManager) { m_pRPCManager = pRPCManager; }

	public:
		virtual KET::KIO::IPacketEncoder<KET::KIO::SimplePacket>& GetEncoder() { return *this; }
		virtual KET::KIO::IPacketDecoder<KET::KIO::SimplePacket>& GetDecoder() { return *this; }

	public:
		virtual bool DoCheckPacketType(int ptype);

	public:
		virtual void OnOpen();
		virtual void OnOpenFailed(KET::KIO::ErrorCode errcode);
		virtual void OnClose(KET::KIO::ErrorCode errcode);
		virtual void OnPacketRecvParse(const KET::KIO::SimplePacket *pPacket);
		virtual void OnPacketRecv(const KET::KIO::SimplePacket *pPacket);

	private:
		RPCManager* m_pRPCManager;
	};
}

#endif
