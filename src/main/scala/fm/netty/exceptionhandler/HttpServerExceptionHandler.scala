package fm.netty.exceptionhandler

import io.netty.channel.ChannelHandlerContext

/** Handler for HTTP exceptions that occur before invoking routes */
trait HttpServerExceptionHandler {
  def doHandle(connectionId: Long, ctx: ChannelHandlerContext, cause: Throwable): Unit
}
