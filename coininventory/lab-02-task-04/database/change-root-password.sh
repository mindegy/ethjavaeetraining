#!/bin/sh

psql -d postgres -h localhost -p 5432 -U postgres -c "ALTER USER postgres WITH PASSWORD 'root';"