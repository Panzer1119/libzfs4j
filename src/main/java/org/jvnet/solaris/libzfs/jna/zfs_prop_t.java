/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the license at usr/src/OPENSOLARIS.LICENSE
 * or http://www.opensolaris.org/os/licensing.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at usr/src/OPENSOLARIS.LICENSE.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */
package org.jvnet.solaris.libzfs.jna;

/**
 * Dataset properties are identified by these constants and must be added to
 * the end of this list to ensure that external consumers are not affected
 * by the change. If you make any changes to this list, be sure to update
 * the property table in usr/src/common/zfs/zfs_prop.c.
 *
 * @author Kohsuke Kawaguchi
 */
public enum zfs_prop_t {
    ZFS_PROP_TYPE,
    ZFS_PROP_CREATION,
    ZFS_PROP_USED,
    ZFS_PROP_AVAILABLE,
    ZFS_PROP_REFERENCED,
    ZFS_PROP_COMPRESSRATIO,
    ZFS_PROP_MOUNTED,
    ZFS_PROP_ORIGIN,
    ZFS_PROP_QUOTA,
    ZFS_PROP_RESERVATION,
    ZFS_PROP_VOLSIZE,
    ZFS_PROP_VOLBLOCKSIZE,
    ZFS_PROP_RECORDSIZE,
    ZFS_PROP_MOUNTPOINT,
    ZFS_PROP_SHARENFS,
    ZFS_PROP_CHECKSUM,
    ZFS_PROP_COMPRESSION,
    ZFS_PROP_ATIME,
    ZFS_PROP_DEVICES,
    ZFS_PROP_EXEC,
    ZFS_PROP_SETUID,
    ZFS_PROP_READONLY,
    ZFS_PROP_ZONED,
    ZFS_PROP_SNAPDIR,
    ZFS_PROP_ACLMODE,
    ZFS_PROP_ACLINHERIT,
    ZFS_PROP_CREATETXG,
    ZFS_PROP_NAME,            /* not exposed to the user */
    ZFS_PROP_CANMOUNT,
    ZFS_PROP_ISCSIOPTIONS,        /* not exposed to the user */
    ZFS_PROP_XATTR,
    ZFS_PROP_NUMCLONES,        /* not exposed to the user */
    ZFS_PROP_COPIES,
    ZFS_PROP_VERSION,
    ZFS_PROP_UTF8ONLY,
    ZFS_PROP_NORMALIZE,
    ZFS_PROP_CASE,
    ZFS_PROP_VSCAN,
    ZFS_PROP_NBMAND,
    ZFS_PROP_SHARESMB,
    ZFS_PROP_REFQUOTA,
    ZFS_PROP_REFRESERVATION,
    ZFS_PROP_GUID,
    ZFS_PROP_PRIMARYCACHE,
    ZFS_PROP_SECONDARYCACHE,
    ZFS_PROP_USEDSNAP,
    ZFS_PROP_USEDDS,
    ZFS_PROP_USEDCHILD,
    ZFS_PROP_USEDREFRESERV,
    ZFS_PROP_USERACCOUNTING,    /* not exposed to the user */
    ZFS_PROP_STMF_SHAREINFO,    /* not exposed to the user */
    ZFS_PROP_DEFER_DESTROY,
    ZFS_PROP_USERREFS,
    ZFS_PROP_LOGBIAS,
    ZFS_PROP_UNIQUE,        /* not exposed to the user */
    ZFS_PROP_OBJSETID,
    ZFS_PROP_DEDUP,
    ZFS_PROP_MLSLABEL,
    ZFS_PROP_SYNC,
    ZFS_PROP_DNODESIZE,
    ZFS_PROP_REFRATIO,
    ZFS_PROP_WRITTEN,
    ZFS_PROP_CLONES,
    ZFS_PROP_LOGICALUSED,
    ZFS_PROP_LOGICALREFERENCED,
    ZFS_PROP_INCONSISTENT,        /* not exposed to the user */
    ZFS_PROP_VOLMODE,
    ZFS_PROP_FILESYSTEM_LIMIT,
    ZFS_PROP_SNAPSHOT_LIMIT,
    ZFS_PROP_FILESYSTEM_COUNT,
    ZFS_PROP_SNAPSHOT_COUNT,
    ZFS_PROP_SNAPDEV,
    ZFS_PROP_ACLTYPE,
    ZFS_PROP_SELINUX_CONTEXT,
    ZFS_PROP_SELINUX_FSCONTEXT,
    ZFS_PROP_SELINUX_DEFCONTEXT,
    ZFS_PROP_SELINUX_ROOTCONTEXT,
    ZFS_PROP_RELATIME,
    ZFS_PROP_REDUNDANT_METADATA,
    ZFS_PROP_OVERLAY,
    ZFS_PROP_PREV_SNAP,
    ZFS_PROP_RECEIVE_RESUME_TOKEN,
    ZFS_PROP_ENCRYPTION,
    ZFS_PROP_KEYLOCATION,
    ZFS_PROP_KEYFORMAT,
    ZFS_PROP_PBKDF2_SALT,
    ZFS_PROP_PBKDF2_ITERS,
    ZFS_PROP_ENCRYPTION_ROOT,
    ZFS_PROP_KEY_GUID,
    ZFS_PROP_KEYSTATUS,
    ZFS_PROP_REMAPTXG,        /* obsolete - no longer used */
    ZFS_PROP_SPECIAL_SMALL_BLOCKS,
    ZFS_PROP_IVSET_GUID,        /* not exposed to the user */
    ZFS_PROP_REDACTED,
    ZFS_PROP_REDACT_SNAPS,
    ZFS_NUM_PROPS
}
