using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using CottageIndustryBD.Resources;

namespace CottageIndustryBD
{
    public partial class MainPage : PhoneApplicationPage
    {
        // Constructor
        public MainPage()
        {
            InitializeComponent();

            // Sample code to localize the ApplicationBar
            //BuildLocalizedApplicationBar();
        }

        private void AboutClick(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/About.xaml", UriKind.Relative));
        }

        private void NakshiClick(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/NakshiKantha.xaml", UriKind.Relative));
        }

        private void JamdaniClick(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/Jamdani.xaml", UriKind.Relative));
        }

        private void JuteClick(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/JuteCraft.xaml", UriKind.Relative));
        }

        private void PotClick(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/Pottery.xaml", UriKind.Relative));
        }

        private void BambooClick(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/BambooCane.xaml", UriKind.Relative));
        }

        private void MuslinClick(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("/Muslin.xaml", UriKind.Relative));
        }

        // Sample code for building a localized ApplicationBar
        //private void BuildLocalizedApplicationBar()
        //{
        //    // Set the page's ApplicationBar to a new instance of ApplicationBar.
        //    ApplicationBar = new ApplicationBar();

        //    // Create a new button and set the text value to the localized string from AppResources.
        //    ApplicationBarIconButton appBarButton = new ApplicationBarIconButton(new Uri("/Assets/AppBar/appbar.add.rest.png", UriKind.Relative));
        //    appBarButton.Text = AppResources.AppBarButtonText;
        //    ApplicationBar.Buttons.Add(appBarButton);

        //    // Create a new menu item with the localized string from AppResources.
        //    ApplicationBarMenuItem appBarMenuItem = new ApplicationBarMenuItem(AppResources.AppBarMenuItemText);
        //    ApplicationBar.MenuItems.Add(appBarMenuItem);
        //}
    }
}