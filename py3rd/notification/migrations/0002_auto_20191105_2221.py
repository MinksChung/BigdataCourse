# Generated by Django 2.2.5 on 2019-11-05 22:21

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('notification', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='notification',
            old_name='user_id',
            new_name='userid',
        ),
    ]
