from datetime import date,datetime,timedelta
import mysql.connector

cnx=mysql.connector.connect(user='root',database='perbankan')
cursor=cnx.cursor()
tanggal = datetime.now().date()
query = ("SELECT nasabah.* FROM nasabah, transaksi\
        WHERE nasabah.id_nasabah=transaksi.id_nasabahFK AND\
        transaksi.tanggal BETWEEN '2009-10-1' AND '2009-12-31'")
cursor.execute(query)
for(id_nasabah,nama_nasabah,alamat_nasabah)in cursor:
    print("ID:{} Nama: {} Alamat: {}".format(
        id_nasabah,nama_nasabah,alamat_nasabah))

cursor.close()
cnx.close()
