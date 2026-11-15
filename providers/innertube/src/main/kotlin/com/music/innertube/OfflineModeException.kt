package com.music.innertube

/** what a request fails with while offline mode is on, an IOException so callers that treat a failed connection as nothing to show carry on doing so */
class OfflineModeException : java.io.IOException("Offline mode is on")

/**
 * Local-only build: this app plays the music on the device and never talks to YouTube.
 * Every YouTube request (InnerTube, NewPipe, stream resolving) fails at once with
 * OfflineModeException, none goes out. Lyrics and artwork providers are not YouTube and
 * are not affected. Flip to false to get the streaming client back.
 */
object LocalOnly {
    @JvmField
    val ENABLED: Boolean = true
}
