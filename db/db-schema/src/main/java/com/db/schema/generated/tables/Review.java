/*
 * This file is generated by jOOQ.
 */
package com.db.schema.generated.tables;


import com.db.schema.generated.Keys;
import com.db.schema.generated.Public;
import com.db.schema.generated.tables.records.ReviewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Review extends TableImpl<ReviewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.review</code>
     */
    public static final Review REVIEW = new Review();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReviewRecord> getRecordType() {
        return ReviewRecord.class;
    }

    /**
     * The column <code>public.review.id</code>.
     */
    public final TableField<ReviewRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.review.comment</code>.
     */
    public final TableField<ReviewRecord, String> COMMENT = createField(DSL.name("comment"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.review.product_id</code>.
     */
    public final TableField<ReviewRecord, Integer> PRODUCT_ID = createField(DSL.name("product_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.review.rating</code>.
     */
    public final TableField<ReviewRecord, Integer> RATING = createField(DSL.name("rating"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.review.timestamp</code>.
     */
    public final TableField<ReviewRecord, String> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.review.user_name</code>.
     */
    public final TableField<ReviewRecord, String> USER_NAME = createField(DSL.name("user_name"), SQLDataType.VARCHAR(255), this, "");

    private Review(Name alias, Table<ReviewRecord> aliased) {
        this(alias, aliased, null);
    }

    private Review(Name alias, Table<ReviewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.review</code> table reference
     */
    public Review(String alias) {
        this(DSL.name(alias), REVIEW);
    }

    /**
     * Create an aliased <code>public.review</code> table reference
     */
    public Review(Name alias) {
        this(alias, REVIEW);
    }

    /**
     * Create a <code>public.review</code> table reference
     */
    public Review() {
        this(DSL.name("review"), null);
    }

    public <O extends Record> Review(Table<O> child, ForeignKey<O, ReviewRecord> key) {
        super(child, key, REVIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<ReviewRecord, Integer> getIdentity() {
        return (Identity<ReviewRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ReviewRecord> getPrimaryKey() {
        return Keys.REVIEW_PKEY;
    }

    @Override
    public Review as(String alias) {
        return new Review(DSL.name(alias), this);
    }

    @Override
    public Review as(Name alias) {
        return new Review(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Review rename(String name) {
        return new Review(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Review rename(Name name) {
        return new Review(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, Integer, Integer, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
