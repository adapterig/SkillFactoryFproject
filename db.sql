PGDMP                         {            fproject    14.6    14.6 	    ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16552    fproject    DATABASE     e   CREATE DATABASE fproject WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE fproject;
                postgres    false            ?            1259    16554    accounts    TABLE     ^   CREATE TABLE public.accounts (
    id integer NOT NULL,
    balance numeric(20,2) NOT NULL
);
    DROP TABLE public.accounts;
       public         heap    postgres    false            ?            1259    16553    accounts_id_seq    SEQUENCE     ?   ALTER TABLE public.accounts ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.accounts_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    210            ?          0    16554    accounts 
   TABLE DATA           /   COPY public.accounts (id, balance) FROM stdin;
    public          postgres    false    210   <       ?           0    0    accounts_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.accounts_id_seq', 1, true);
          public          postgres    false    209            ]           2606    16558    accounts accounts_pk 
   CONSTRAINT     R   ALTER TABLE ONLY public.accounts
    ADD CONSTRAINT accounts_pk PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.accounts DROP CONSTRAINT accounts_pk;
       public            postgres    false    210            ?      x?3??4?30?????? ??     