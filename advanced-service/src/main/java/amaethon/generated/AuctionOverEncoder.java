/*
 * Copyright 2015 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

/* Generated SBE (Simple Binary Encoding) message codec */
package amaethon.generated;

import uk.co.real_logic.agrona.MutableDirectBuffer;
import uk.co.real_logic.sbe.codec.java.CodecUtil;

public class AuctionOverEncoder
{
    public static final int BLOCK_LENGTH = 24;
    public static final int TEMPLATE_ID = 5;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final AuctionOverEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
    protected int offset;
    protected int limit;
    protected int actingBlockLength;
    protected int actingVersion;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public int offset()
    {
        return offset;
    }

    public AuctionOverEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);
        return this;
    }

    public int size()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        buffer.checkLimit(limit);
        this.limit = limit;
    }

    public static int auctionIdNullValue()
    {
        return -2147483648;
    }

    public static int auctionIdMinValue()
    {
        return -2147483647;
    }

    public static int auctionIdMaxValue()
    {
        return 2147483647;
    }
    public AuctionOverEncoder auctionId(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static long winningBidderIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long winningBidderIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long winningBidderIdMaxValue()
    {
        return 9223372036854775807L;
    }
    public AuctionOverEncoder winningBidderId(final long value)
    {
        CodecUtil.int64Put(buffer, offset + 4, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static long winningBidNullValue()
    {
        return -9223372036854775808L;
    }

    public static long winningBidMinValue()
    {
        return -9223372036854775807L;
    }

    public static long winningBidMaxValue()
    {
        return 9223372036854775807L;
    }
    public AuctionOverEncoder winningBid(final long value)
    {
        CodecUtil.int64Put(buffer, offset + 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int quantityLeftNullValue()
    {
        return -2147483648;
    }

    public static int quantityLeftMinValue()
    {
        return -2147483647;
    }

    public static int quantityLeftMaxValue()
    {
        return 2147483647;
    }
    public AuctionOverEncoder quantityLeft(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 20, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
