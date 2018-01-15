# Peaceful Nights, Dangerous Caves

**Peaceful Nights, Dangerous Caves** makes hostile mobs spawn only underground, where they belong!

Enjoy stargazing, late-night construction sessions, and moon-lit walks on the beach. Rediscover the great outdoors with an overnight camping trip. Clean up the litter of torches in your yard. Light your house with natural light during the day and let comforting darkness descend at night.

But keep your mines and basements lit, and beware of dark cave mouths when walking at night. Monsters still spawn in dark tunnels and sneak out of cracks in the earth to terrorize unwary surface-dwellers.

## How does it work? ##

An extra check is added to the spawning rules in the Overworld that makes any block that can see the night sky directly, or is near an opening to the night sky, a safe non-spawning location. The effect is that if it's a safe block during the day in the sunlight, it will be a safe block during the night too. If you use NEI's mob-spawn overlay, this means only blocks marked with a red X are still legal spawning locations.

An exception is made for slime spawning, so that they can still spawn in swamps at night. Nether and End spawning is unchanged.

## Will this interfere with my mob spawner? ##

So long as your mob spawner works during the day, it will keep working at night. In fact, it may become more efficient at night since the nighttime surface won't be a legal spawning location anymore.

## How do I get it? ##

* Download [PNDC](http://adf.ly/xcVRH) version 0.1
* Forge is required, naturally. Drop the .jar file into your mods folder.

The source is available right here on GitHub: https://github.com/eggdropsoap/minecraft-pndc (see license section below)

## Will there be bugs? ##

Oh, probably! Version 0.1 is the very first release, and bugs are to be expected in a brand-new mod. Please report any bugs you encounter here, and I'll get them fixed as soon as I can.

## Why did you make this? ##

Because I wanted to go for a long journey and camp under the stars beside my firepit in Terrafirmacraft, to properly enjoy the slow pace of Minecraft "life" in that mod, but still be truly terrified of the monsters that lurk underground (and in my poorly-lit malachite mine). Peaceful mode makes nights more, well, peaceful, but takes all the challenge out of exploring underground.

Also, it's always bothered me that monsters just "pop" into existence at night. I've always felt like if they're creeping around at night, they should come [i]from[/i] somewhere, not just coalesce out of the darkness before my eyes. With this mod, now monsters never pop into existence where I can see them — they're always coming from somewhere deeper in the tunnels ahead of my torches, or sneaking out of a dark hole to ambush me while I putter around my night garden.

## Can I include it in a modpack? ##

Since this is the first release and there might still be show-stopping bugs, I prefer to be asked before its included in a public modpack. But if you ask, I'll probably say yes! (You don't need permission to use it in a private modpack, of course.)

I plan to give free permission to use it in modpacks once I'm confident that there aren't any [b]major[/b] bugs, like Enderdragons failing to spawn or something ridiculous like that.

## How is it licensed? ##

PNDC is licensed under the [FreeBSD license](https://en.wikipedia.org/wiki/BSD_licenses#2-clause_license_(%22Simplified_BSD_License%22_or_%22FreeBSD_License%22)), as follows:

    Copyright (c) 2015, Keenan Scott  
    All rights reserved.
    
    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions are met:
    
    1. Redistributions of source code must retain the above copyright notice, this
       list of conditions and the following disclaimer.
    2. Redistributions in binary form must reproduce the above copyright notice,
       this list of conditions and the following disclaimer in the documentation
       and/or other materials provided with the distribution.
    
    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
    ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
    WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
    DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
    ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
    (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
    LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
    ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
    (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
    SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
    
    The views and conclusions contained in the software and documentation are those
    of the authors and should not be interpreted as representing official policies,
    either expressed or implied, of the FreeBSD Project.

