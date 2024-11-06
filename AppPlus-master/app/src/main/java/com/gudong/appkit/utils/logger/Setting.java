/*
 *     Copyright (c) 2015 GuDong
 *
 *     Permission is hereby granted, free of charge, to any person obtaining a copy
 *     of this software and associated documentation files (the "Software"), to deal
 *     in the Software without restriction, including without limitation the rights
 *     to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *     copies of the Software, and to permit persons to whom the Software is
 *     furnished to do so, subject to the following conditions:
 *
 *     The above copyright notice and this permission notice shall be included in all
 *     copies or substantial portions of the Software.
 *
 *     THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *     IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *     FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *     AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *     LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *     OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *     SOFTWARE.
 */

package com.gudong.appkit.utils.logger;

/**
 * Created by mao on 8/16/15.
 */
public class Setting {

    private static Setting setting = new Setting();

    private Setting(){
    }

    public synchronized static Setting getInstance(){
        return setting;
    }

    private static final String DEF_TAG = "logger";
    private static String mTag = DEF_TAG;
    private static LogLevel mLevel = LogLevel.FULL;

    public Setting setLogLevel(LogLevel level){
        mLevel = level;
        return setting;
    }

    public Setting setTag(String tag){
        mTag = tag;
        return setting;
    }

    public LogLevel getLevel() {
        return mLevel;
    }

    public String getTag(){
        return mTag;
    }

    public String getDefTag(){
        return DEF_TAG;
    }
}
