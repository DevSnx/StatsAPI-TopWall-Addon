package de.snx.statsapi.addon.topwall.manager;

public class TopwallManager {




                        if(StatsAPI.getRankingManager().getUUID(RankedType.OPENCHESTS, finalI) != null){

        UUID uuid = StatsAPI.getRankingManager().getUUID(RankedType.OPENCHESTS, finalI);
        String playerName = UUIDFetcher.getName(uuid);
        int openchests = StatsAPI.getRankingManager().getValues(RankedType.OPENCHESTS, uuid);
        int rank = finalI;
        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.OPENCHESTS");
        message = message.replace("%RANK%", String.valueOf(finalI));
        message = message.replace("%PLAYERNAME%", String.valueOf(playerName));
        message = message.replace("%OPENCHESTS%", String.valueOf(openchests));
    }else{
        message = StatsAPIAddon.getFileManager().getPlaceholdersFile().getPlaceholderMessage("PLACEHOLDER.TOP.NOAVAIBLE");
    }



}
