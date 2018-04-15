package com.mrcrayfish.device.programs.gitweb.module;

import com.mrcrayfish.device.api.app.Layout;

import java.util.Map;

/**
 * Author: MrCrayfish
 */
public abstract class Module
{
    public abstract String[] getRequiredData();

    public abstract int calculateHeight(Map<String, String> data, int width);

    public abstract void generate(Layout layout, Map<String, String> data, int width);
}