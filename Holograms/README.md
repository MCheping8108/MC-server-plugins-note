加载插件时出现error log
``` java
[02:46:26] [Server thread/ERROR]: Error occurred while enabling Holograms v1.0-BETA (Is it up to date?)
java.lang.NullPointerException: Cannot invoke "org.bukkit.command.PluginCommand.setExecutor(org.bukkit.command.CommandExecutor)" because the return value of "top.peacefuly.holograms.Holograms.getCommand(String)" is null
        at top.peacefuly.holograms.Holograms.onEnable(Holograms.java:11) ~[?:?]
        at org.bukkit.plugin.java.JavaPlugin.setEnabled(JavaPlugin.java:267) ~[spigot-api-1.21-R0.1-SNAPSHOT.jar:?]
        at org.bukkit.plugin.java.JavaPluginLoader.enablePlugin(JavaPluginLoader.java:342) ~[spigot-api-1.21-R0.1-SNAPSHOT.jar:?]
        at org.bukkit.plugin.SimplePluginManager.enablePlugin(SimplePluginManager.java:492) ~[spigot-api-1.21-R0.1-SNAPSHOT.jar:?]
        at org.bukkit.craftbukkit.v1_21_R1.CraftServer.enablePlugin(CraftServer.java:567) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at org.bukkit.craftbukkit.v1_21_R1.CraftServer.enablePlugins(CraftServer.java:481) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at org.bukkit.craftbukkit.v1_21_R1.CraftServer.reload(CraftServer.java:1005) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at org.bukkit.Bukkit.reload(Bukkit.java:867) ~[spigot-api-1.21-R0.1-SNAPSHOT.jar:?]
        at org.bukkit.command.defaults.ReloadCommand.execute(ReloadCommand.java:27) ~[spigot-api-1.21-R0.1-SNAPSHOT.jar:?]
        at org.bukkit.command.SimpleCommandMap.dispatch(SimpleCommandMap.java:150) ~[spigot-api-1.21-R0.1-SNAPSHOT.jar:?]
        at org.bukkit.craftbukkit.v1_21_R1.CraftServer.dispatchCommand(CraftServer.java:913) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at org.bukkit.craftbukkit.v1_21_R1.command.BukkitCommandWrapper.run(BukkitCommandWrapper.java:50) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at com.mojang.brigadier.context.ContextChain.runExecutable(ContextChain.java:73) ~[brigadier-1.2.9.jar:?]
        at net.minecraft.commands.execution.tasks.ExecuteCommand.a(SourceFile:29) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.commands.execution.tasks.ExecuteCommand.execute(SourceFile:13) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.commands.execution.UnboundEntryAction.a(SourceFile:8) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.commands.execution.CommandQueueEntry.a(SourceFile:8) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.commands.execution.ExecutionContext.a(SourceFile:107) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.commands.CommandDispatcher.a(CommandDispatcher.java:414) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.commands.CommandDispatcher.performCommand(CommandDispatcher.java:336) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.commands.CommandDispatcher.a(CommandDispatcher.java:323) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.network.PlayerConnection.b(PlayerConnection.java:1842) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.network.PlayerConnection.lambda$handleChatCommand$7(PlayerConnection.java:1818) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.TickTask.run(SourceFile:18) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.util.thread.IAsyncTaskHandler.d(SourceFile:162) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.util.thread.IAsyncTaskHandlerReentrant.d(SourceFile:23) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.MinecraftServer.b(MinecraftServer.java:1270) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.MinecraftServer.d(MinecraftServer.java:203) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.util.thread.IAsyncTaskHandler.B(SourceFile:136) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.MinecraftServer.bv(MinecraftServer.java:1249) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.MinecraftServer.B(MinecraftServer.java:1242) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.util.thread.IAsyncTaskHandler.b(SourceFile:145) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.MinecraftServer.b(MinecraftServer.java:1207) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.MinecraftServer.v_(MinecraftServer.java:1214) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.MinecraftServer.y(MinecraftServer.java:1078) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at net.minecraft.server.MinecraftServer.lambda$spin$0(MinecraftServer.java:318) ~[spigot-1.21-R0.1-SNAPSHOT.jar:4226-Spigot-146439e-2889b3a]
        at java.base/java.lang.Thread.run(Thread.java:1583) [?:?]
```