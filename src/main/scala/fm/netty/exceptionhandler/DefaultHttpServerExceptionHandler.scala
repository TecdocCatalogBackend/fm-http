package fm.netty.exceptionhandler

import fm.common.Logging
import io.netty.channel.ChannelHandlerContext

class DefaultHttpServerExceptionHandler extends HttpServerExceptionHandler with Logging {

  override def doHandle(connectionId: Long,  ctx: ChannelHandlerContext, cause: Throwable): Unit = {
    logger.error(s"$connectionId - exceptionCaught - ${ctx.channel}", cause)
  }
}
