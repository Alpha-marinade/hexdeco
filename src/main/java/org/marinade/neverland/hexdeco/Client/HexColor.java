package org.marinade.neverland.hexdeco.Client;

import at.petrak.hexcasting.client.render.PatternColors;

import static at.petrak.hexcasting.client.render.PatternColors.glowyStroke;

public enum HexColor {
    DEFAULT(0,"hexcasting:default_colorizer", PatternColors.DEFAULT_PATTERN_COLOR,PatternColors.SLATE_WOBBLY_PURPLE_COLOR),
    UUID(0,"hexcasting:uuid_colorize",  PatternColors.DEFAULT_PATTERN_COLOR,PatternColors.SLATE_WOBBLY_PURPLE_COLOR),
    WHITE(1,"hexcasting:dye_colorizer_white", new PatternColors(-11250604,-3026479),glowyStroke(-1381654)),
    ORANGE(2,"hexcasting:dye_colorizer_orange", new PatternColors(-11185843,-2961464),glowyStroke(-797536)),
    MAGENTA(3,"hexcasting:dye_colorizer_magenta", new PatternColors(-11186859,-2963247),glowyStroke(-810775)),
    LIGHT_BLUE(4,"hexcasting:dye_colorizer_light_blue", new PatternColors(-11709099,-3616046),glowyStroke(-6229005)),
    YELLOW(5,"hexcasting:dye_colorizer_yellow", new PatternColors(-11184819,-3026232),glowyStroke(-855136)),
    LIME(6,"hexcasting:dye_colorizer_lime", new PatternColors(-11709107,-3616056),glowyStroke(-6229085)),
    PINK(7,"hexcasting:dye_colorizer_pink", new PatternColors(-11186862,-2963248),glowyStroke(-806425)),
    GRAY(8,"hexcasting:dye_colorizer_gray", new PatternColors(-11250604,-2960686),glowyStroke(-8289919)),
    LIGHT_GRAY(9,"hexcasting:dye_colorizer_light_gray", new PatternColors(-11250604,-2960686),glowyStroke(-5658199)),
    CYAN(10,"hexcasting:dye_colorizer_cyan", new PatternColors(-11709100,-3616047),glowyStroke(-6229015)),
    PURPLE(11,"hexcasting:dye_colorizer_purple", new PatternColors(-11449003,-3290926),glowyStroke(-4621581)),
    BLUE(12,"hexcasting:dye_colorizer_blue", new PatternColors(-11710891,-3618350),glowyStroke(-8484363)),
    BROWN(13,"hexcasting:dye_colorizer_brown", new PatternColors(-11185843,-2961976),glowyStroke( -7707064)),
    GREEN(14,"hexcasting:dye_colorizer_green", new PatternColors(-11709107,-3616056),glowyStroke(-12148920)),
    RED(15,"hexcasting:dye_colorizer_red", new PatternColors(-11186867,-2963249),glowyStroke(-810848)),
    BLACK(16,"hexcasting:dye_colorizer_black", new PatternColors(-13553359, -9342607), glowyStroke(-14145496)),

    AGENDER(17,"hexcasting:pride_colorizer_agender", new PatternColors(-11250604,-2960686),new PatternColors(-14145496,-6229085)),
    AROACE(18,"hexcasting:pride_colorizer_aroace", new PatternColors(-797536,-855136),new PatternColors(-6229005,-8484363)),
    AROMANTIC(19,"hexcasting:pride_colorizer_aromantic", new PatternColors(-12148920,-6229085),new PatternColors(-8289919,-14145496)),
    ASEXUAL(20,"hexcasting:pride_colorizer_asexual", new PatternColors(-1381654,-8289919),new PatternColors(-4621581,-14145496)),
    BISEXUAL(21,"hexcasting:pride_colorizer_bisexual", new PatternColors(-806425,-4621581),new PatternColors(-806425,-8484363)),
    DEMIBOY(22,"hexcasting:pride_colorizer_demiboy", new PatternColors(-1381654,-5658199),new PatternColors(-1381654,-6229005)),
    DEMIGIRL(23,"hexcasting:pride_colorizer_demigirl", new PatternColors(-1381654,-5658199),new PatternColors(-1381654,-806425)),
    GAY(24,"hexcasting:pride_colorizer_gay", new PatternColors(-8484363,-6229085),new PatternColors(-810848,-797536)),
    GENDERFLUID(25,"hexcasting:pride_colorizer_genderfluid", new PatternColors(-1381654,-806425),new PatternColors(-4621581,-14145496)),
    GENDERQUEER(26,"hexcasting:pride_colorizer_genderqueer", new PatternColors(-1381654,-6229085), new PatternColors(-1381654,-806425)),
    INTERSEX(27,"hexcasting:pride_colorizer_intersex", new PatternColors(-11184819,-3026232),new PatternColors(-855136,-4621581)),
    LESBIAN(28,"hexcasting:pride_colorizer_lesbian", new PatternColors(-810775,-4621581),new PatternColors(-810848,-797536)),

    NONBINARY(29,"hexcasting:pride_colorizer_nonbinary", new PatternColors(-855136,-14145496),new PatternColors(-14145496,-4621581)),
    PANSEXUAL(30,"hexcasting:pride_colorizer_pansexual", new PatternColors(-806425,-855136),new PatternColors(-6229005,-855136)),
    PLURAL(31,"hexcasting:pride_colorizer_plural", new PatternColors(-8484363,-4621581),new PatternColors(-6229015,-14145496)),
    TRANSGENER(32,"hexcasting:pride_colorizer_transgender",new PatternColors(-806425,-1381654),new PatternColors(-6229005,-1381654));

    private final int id;
    private final String name;
    private final PatternColors off_color;
    private final PatternColors on_color;

    HexColor(int id, String name, PatternColors offColor, PatternColors onColor) {
        this.id = id;
        this.name = name;
        this.off_color = offColor;
        this.on_color = onColor;
    }
    public int getId() {
        return this.id;
    }
    public String getName(){
        return  this.name;
    }

    public static HexColor getById(int id) {
        for (HexColor color : values()) {
            if (color.id == id) {
                return color;
            }
        }
        return null;
    }
    public PatternColors getOffColor(){
        return this.off_color;
    }
    public PatternColors getOnColor(){
        return this.on_color;
    }
}
