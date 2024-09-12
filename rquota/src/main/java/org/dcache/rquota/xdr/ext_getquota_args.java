/*
 * Automatically generated by jrpcgen 1.0.7+ on 6/19/24, 7:09 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.rquota.xdr;
import org.dcache.oncrpc4j.rpc.*;
import org.dcache.oncrpc4j.rpc.net.*;
import org.dcache.oncrpc4j.xdr.*;
import java.io.IOException;

public class ext_getquota_args implements XdrAble {
    public String gqa_pathp;
    public int gqa_type;
    public int gqa_id;

    public ext_getquota_args() {
    }

    public ext_getquota_args(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeString(gqa_pathp);
        xdr.xdrEncodeInt(gqa_type);
        xdr.xdrEncodeInt(gqa_id);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        gqa_pathp = xdr.xdrDecodeString();
        gqa_type = xdr.xdrDecodeInt();
        gqa_id = xdr.xdrDecodeInt();
    }

}
// End of ext_getquota_args.java